package io.marc.main;

import java.util.Scanner;
import io.marc.assets.Fab;

/**
 * Shell
 */
public class Shell {

    public static void main(String[] args) {
        
        int x = 4;
        while (x > 0) {
        /**while (true) {*/
            try {
                Scanner inputScanner = new Scanner(System.in);
                System.out.print("$fab>>> ");
                String inputString = inputScanner.nextLine();
                //something
    
                System.out.println(inputString);
    
                /** Using "while" the scanner should not close */
                /**inputScanner.close();*/
                x--;
                if(x < 0) {
                    inputScanner.close();
                    break;
                }

                //inputScanner.close();
                
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        /**}*/
        }
    }
}