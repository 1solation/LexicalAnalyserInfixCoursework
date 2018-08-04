
package infix;

public class IdentToken extends Token {
    public String identifierName;
    public int value;
    
    public IdentToken(String identName) {
        super(TokenType.ID);
        identifierName = identName;
        value = 0;
    }

    public String getIdName() {
        return identifierName;
    }
    
    public void setValue(int newValue) {
        value = newValue;
    }
    
    public int getValue() {
        return value;
    }
    
    public void print() {
        System.out.println("Identifier Token: " + identifierName);
    }
}
