package io.marc.lib;

public class Lexer {
    
    private String text;
    private int position;
    private String currentChar;

    //Constructor
    public Lexer(String text) {
        this.text = text;
        this.position = -1;
        this.currentChar = null;
    }

    public void advance() {
        this.position += 1;
        //this.currentChar = this.position
    }

}