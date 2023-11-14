# Generated from python.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .pythonParser import pythonParser
else:
    from pythonParser import pythonParser

# This class defines a complete listener for a parse tree produced by pythonParser.
class pythonListener(ParseTreeListener):

    # Enter a parse tree produced by pythonParser#s.
    def enterS(self, ctx:pythonParser.SContext):
        pass

    # Exit a parse tree produced by pythonParser#s.
    def exitS(self, ctx:pythonParser.SContext):
        pass


    # Enter a parse tree produced by pythonParser#branch.
    def enterBranch(self, ctx:pythonParser.BranchContext):
        pass

    # Exit a parse tree produced by pythonParser#branch.
    def exitBranch(self, ctx:pythonParser.BranchContext):
        pass


    # Enter a parse tree produced by pythonParser#var.
    def enterVar(self, ctx:pythonParser.VarContext):
        pass

    # Exit a parse tree produced by pythonParser#var.
    def exitVar(self, ctx:pythonParser.VarContext):
        pass


    # Enter a parse tree produced by pythonParser#comparison.
    def enterComparison(self, ctx:pythonParser.ComparisonContext):
        pass

    # Exit a parse tree produced by pythonParser#comparison.
    def exitComparison(self, ctx:pythonParser.ComparisonContext):
        pass


    # Enter a parse tree produced by pythonParser#branchstatement.
    def enterBranchstatement(self, ctx:pythonParser.BranchstatementContext):
        pass

    # Exit a parse tree produced by pythonParser#branchstatement.
    def exitBranchstatement(self, ctx:pythonParser.BranchstatementContext):
        pass


    # Enter a parse tree produced by pythonParser#assign.
    def enterAssign(self, ctx:pythonParser.AssignContext):
        pass

    # Exit a parse tree produced by pythonParser#assign.
    def exitAssign(self, ctx:pythonParser.AssignContext):
        pass


    # Enter a parse tree produced by pythonParser#operation.
    def enterOperation(self, ctx:pythonParser.OperationContext):
        pass

    # Exit a parse tree produced by pythonParser#operation.
    def exitOperation(self, ctx:pythonParser.OperationContext):
        pass



del pythonParser