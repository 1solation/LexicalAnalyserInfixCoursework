
package infix;

import java.io.IOException;
import java.util.Hashtable;

public class Lexer {
    public int lineNumber = 1;
    private char peek = ' ';
    private Hashtable identifiers = new Hashtable();
    void addIdentifier(IdentToken t) { identifiers.put(t.identifierName, t); }
    public Lexer() {
        
    }

    // This next method is for you to write, to scan the next input character(s) and return the correct Token for the next lexeme
    // The comments inside the scan() method may help you to structure your code
    public Token scan() throws IOException {
        // First we may read characters until end of whitespace (spaces, tabs or newlines)...
               
        // Now determine what type of token we have and return the correct type (identifier, number, etc.) 

        //If we have gotten to here, we have not matched any token so print an error message and return a NULL_TOKEN
        System.out.println("Syntax Error");
        return new Token(TokenType.NULL_TOKEN);
    } 

    public Hashtable getIdentifiers() {
        return identifiers;
    }
}
