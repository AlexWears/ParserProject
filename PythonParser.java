import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;

public class PythonParser extends Parser
{
    public PythonParser(TokenStream input)
    {
        super(input);
    }

    @Override
    public String[] getTokenNames() {
        return new String[0];
    }

    @Override
    public String[] getRuleNames() {
        return new String[0];
    }

    @Override
    public String getGrammarFileName() {
        return null;
    }

    @Override
    public ATN getATN() {
        return null;
    }
}
