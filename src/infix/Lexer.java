
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
    	for( ; ; peek = (char)System.in.read()) {
            if(peek == ' ' || peek == '\t' || peek=='\n' || peek=='\r') continue;
            else break;   
    	}
        // Now determine what type of token we have and return the correct type (identifier, number, etc.) 
    	   //checking if next token is a digit 0-9
        if (Character.isDigit(peek)) { 
            int v = 0;
            do {
                v = 10*v + Character.digit(peek, 10);
                peek = (char)System.in.read();
            } while(Character.isDigit(peek));
            return new NumToken(v); // v stores the integer value of the token
        }
        //now check if next token if a VALID identifier or keyword
        if(Character.isLetter(peek)) {
            StringBuffer b = new StringBuffer();
            do {
                b.append(peek);
                peek = (char)System.in.read();
            } while(Character.isLetterOrDigit(peek));
            String s = b.toString(); // s now stores the next lexeme as a string
            
            if(s.equals("INT")) {
                // s represents an int keyword
                Token key = new Token(TokenType.KEYWORD);
                return key;
            }
        }
        //If we have gotten to here, we have not matched any token so print an error message and return a NULL_TOKEN
        System.out.println("Syntax Error");
        return new Token(TokenType.NULL_TOKEN);
    } 

    public Hashtable getIdentifiers() {
        return identifiers;
    }
}
