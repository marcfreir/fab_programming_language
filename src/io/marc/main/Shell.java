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

        String fabVersion = "1.0";
        String commandVersion = "fab --version";
        
        while (true) {
            try {
                Console console = System.console();

                if (console == null) {
                    System.out.println("Nothing to show!");
                    return;
                }

                String inputString = console.readLine("$fab>>> ");

                if (inputString.equals(commandVersion)) {
                    System.out.println("Fab current version: " + fabVersion);
                    continue;
                }

                System.out.println(inputString);


            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}