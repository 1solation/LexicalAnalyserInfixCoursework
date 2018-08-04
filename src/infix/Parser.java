
package infix;

import java.util.Hashtable;

public class Parser {
    public Token[] tokens;  // Array of tokens to be parsed
    public int position;    // Current position in array
    
    Hashtable vars;         // Hashtable of all identifiers
    
    public Parser(Token[] tokenSeq, Hashtable variables) {
        tokens = tokenSeq;  
        position = 0;       // Current position in sequence
        vars = variables;
    }
     
    private void parseError() {
        System.out.println("Parse Error on:");
        tokens[position].print();
    }
    
    // The following helper method allows us to check if the current token
    // is of type tokType and if so increment the position counter
    private void match(TokenType tokType) {
        if(tokens[position].returnType() != tokType) {
            parseError();
        }
        position++;
    } 
     
    // The following helper method allows us to check if the current token
    // is of type tokType without incrementing the position counter
    private boolean check(TokenType tokType) {
        if(tokens[position].returnType() != tokType) {
            return false;
        }
        return true;
    }
    
    // Start to parse the program
    public void prog() {
        // First parse declarations
        decls();
        // Next parse the expression
        expr();
        // Finally parse the end of file character
        end_of_file();
    }
    
    // The rest of the methods (such as decls(), expr() etc.) are up to you to write

}
