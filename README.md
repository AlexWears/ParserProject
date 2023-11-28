# ParserProject
Parser Project for CMP_SC-4450, by Alex Wears and Abby Hynes

The goal of this project is to make a grammar that defines some of the features of Python 3.x

In order to run the parser, run the commands:
  - ./antlr4py python.g4
    - This should install the required libraries if it is not already installed, and make the ANTLR generated classes.
  - python/python3 main.py (file you want to test)
    - This will parse the file and report the number of syntax errors.

After running is complete, there should be a file called "parseTree.txt" that has appeared, it will contain the parse tree for the file that you parsed.
