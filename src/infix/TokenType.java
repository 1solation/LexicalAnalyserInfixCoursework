package infix;

/*
Tokens representing:
NUM - a number, e.g. 4
ID - an identifier, e.g. x
OPERATOR - an operator, e.g. +
INT_KEYWORD - the integer keyword, use in declarations
END_OF_FILE - represents the $ symbol at the end of a valid program
SEMI_COLON - represents the ; which separates declarations
NULL_TOKEN - represents and empty token (or an error)
*/

public enum TokenType {
    NUM, ID, OPERATOR, INT_KEYWORD, END_OF_FILE, SEMI_COLON, NULL_TOKEN 
}
