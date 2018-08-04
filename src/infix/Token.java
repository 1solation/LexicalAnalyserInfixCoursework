package infix;

// Basic class for tokens, can be extended by subclasses for each particular token
public class Token {
    TokenType thisToken;
    
    public Token() {
        thisToken = TokenType.NULL_TOKEN;
    }
    
    public Token(TokenType inputToken) {
        thisToken = inputToken;
    }
    
    public TokenType returnType() {
        return thisToken;
    }
    
    public void print() {
        switch(thisToken) {
	    case INT_KEYWORD: System.out.println("INT keyword Token");
            case OPERATOR: System.out.println("Operator Token");
            case END_OF_FILE: System.out.println("END_OF_FILE Token");
            case END_OF_LINE: System.out.println("END_OF_LINE Token");
        }
    }
}