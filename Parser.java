import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.InputStream;

public class Parser {
    public static void main(String[] args) throws Exception {
        InputStream in = Parser.class.getResourceAsStream("project_deliverable_1_testcase.py");
        if (in == null)
        {
            throw new Exception();
        }
        Lexer lexer = new pythonLexer(CharStreams.fromStream(in));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);

        ParseTreeWalker walker = new ParseTreeWalker();
    }
}
