package io.marc.main;

import java.io.Console;

import io.marc.lib.Fab;

/**
 *   ###       #       #     #     #
 *  #     #### #####    #     #     #
 * ####  #   # #    #    #     #     #
 *  #    #   # #    #   #     #     #
 *  #     #### #####   #     #     #
 */

/**
 * Shell
 */
public class Shell {

    public static void main(String[] args) {
        
        while (true) {
            try {
                Console console = System.console();

                if (console == null) {
                    System.out.println("Nothing to show!");
                    return;
                }

                String inputString = console.readLine("$fab>>> ");

                System.out.println(inputString);


            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}