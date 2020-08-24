package io.marc.lib;

/**
 *   ###       #       #     #     #
 *  #     #### #####    #     #     #
 * ####  #   # #    #    #     #     #
 *  #    #   # #    #   #     #     #
 *  #     #### #####   #     #     #
 */

public class Token {

    //Tokens
    private final String TOKENTYPE_INT             = "INT";
    private final String TOKENTYPE_FLOAT           = "FLOAT";
    private final String TOKENTYPE_PLUS            = "PLUS";
    private final String TOKENTYPE_MINUS           = "MINUS";
    private final String TOKENTYPE_MUL             = "MUL";
    private final String TOKENTYPE_DIV             = "DIV";
    private final String TOKENTYPE_LEFTPARENTESIS  = "LPAREN";
    private final String TOKENTYPE_RIGHTPARENTESIS = "RPAREN";

    
    private String type;
    private String value;

    //Constructor
    public Token(String type, String value) {
        this.type = type;
        this.value = value;
    }

    //String representation object method
    public String toString() {
        
        if (this.value != null) {
            return String.format("%s:%s", type, value);
        }
        return String.format("%s", type);
        
    }

}