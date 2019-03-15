package calculator;

import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {
        CalculatorLexer lexer = new CalculatorLexer(new ANTLRInputStream( new FileInputStream(args[0])));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.exprList();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}