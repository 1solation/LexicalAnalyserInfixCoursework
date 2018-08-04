/*
 * Infix Language Skeleton Java program
 * You may use these .java files as a start for your coursework
 * All other coding should be your own (individual coursework)
 */
package infix;

import java.io.IOException;
import java.util.Hashtable;

public class Infix {
    public static final int MAX_NUM_TOKENS = 1000; // You may assume there will be no more than 1000 tokens
    
    public static Token[] tokenSequence = new Token[MAX_NUM_TOKENS];
    public static int currentToken=0;
    public static Hashtable idents;
    public static boolean lexAnalysisSuccessful = true;

    public static void main(String[] args) {
        Lexer lex = new Lexer();
        Token nextToken = new Token(TokenType.END_OF_LINE);
        do {
            try {
                nextToken = lex.scan();
                tokenSequence[currentToken] = nextToken;
                if(nextToken.returnType() == TokenType.NULL_TOKEN)
                    lexAnalysisSuccessful = false;
                currentToken++;
            }
            catch(IOException ex) {
                System.out.println("Syntax Error");
            }
        } while(nextToken.returnType() != TokenType.END_OF_FILE);
        
        // Lexical analysis complete, now on to parsing..
        System.out.println("--- Beginning Parsing ---");
        idents = lex.getIdentifiers();
	// This next declaration passes the sequence of tokens and hastable of identifiers to the parser
        Parser pars = new Parser(tokenSequence, idents);
        pars.prog();
        System.out.println("--- Ending Parsing ---");
    }
}
