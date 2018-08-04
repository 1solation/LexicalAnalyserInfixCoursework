
package infix;

public class OperatorToken  extends Token {
    public OperatorType opType;
    
    public OperatorToken(OperatorType thisOp) {
        super(TokenType.OPERATOR);
        opType = thisOp;
    }
    
    public OperatorType getType() {
        return opType;
    }
    
    public void print() {
        switch(opType) {
            case PLUS: System.out.println("Operator Token: PLUS"); break;
            case MINUS: System.out.println("Operator Token: MINUS"); break;
            case MULTIPLY: System.out.println("Operator Token: MULTIPLY"); break;
            case MODULUS: System.out.println("Operator Token: MODULUS"); break;
        }
    }
}
