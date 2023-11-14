import sys
from antlr4 import *
from generated_classes import pythonLexer
from generated_classes import pythonParser
import re

def parse_nested(text, left=r'[(]', right=r'[)]', sep=r','):
    """ Code from https://stackoverflow.com/questions/23185540/turn-a-string-with-nested-parenthesis-into-a-nested-list-python
     by user unutbu """
    pat = r'({}|{}|{})'.format(left, right, sep)
    tokens = re.split(pat, text)    
    stack = [[]]
    for x in tokens:
        if not x or re.match(sep, x): continue
        if re.match(left, x):
            stack[-1].append([])
            stack.append(stack[-1][-1])
        elif re.match(right, x):
            stack.pop()
            if not stack:
                raise ValueError('error: opening bracket is missing')
        else:
            stack[-1].append(x)
    if len(stack) > 1:
        print(stack)
        raise ValueError('error: closing bracket is missing')
    return stack.pop()

def print_tree(tree, tab):
    return_string = ""
    for i in tree:
        if isinstance(i, str):
            i = i.strip()
            if i == "":
                continue
            for j in range(tab):
                return_string = return_string + '   '
            return_string = return_string + i + ' {\n'
        else:
            return_string = return_string + print_tree(i, tab + 1)

    for j in range(tab):
        return_string = return_string + '   '
    return_string = return_string + '}\n'
    
    return return_string

def main(argv):
    if len(sys.argv) > 1:
        input = FileStream(sys.argv[1])
    else:
        input = InputStream(sys.stdin.readline())

    lexer = pythonLexer.pythonLexer(input)
    tokens = CommonTokenStream(lexer)
    parser = pythonParser.pythonParser(tokens)
    tree = parser.s()
    print("Number of Errors: " + str(parser.getNumberOfSyntaxErrors()))
    formatted_tree = print_tree(parse_nested(tree.toStringTree(recog=parser)), 0)
    print(formatted_tree)

    with open("parseTree.txt", "w") as f:
        f.write("-- Parse tree for file " + sys.argv[1] + " --\n\n")
        f.write(formatted_tree)

if __name__ == '__main__':
    main(sys.argv)