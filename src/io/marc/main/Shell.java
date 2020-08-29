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

    public static void main(final String[] args) {

        final String fabVersion = "1.0";
        final String commandVersion = "fab --version";

        while (true) {
            try {
                final Console console = System.console();

                final String inputString = console.readLine("$fab>>> ");

                /** For the $udo commands */
                if (inputString.equals(commandVersion)) {
                    System.out.println("Fab current version: " + fabVersion);
                    continue;
                }

                if (isNullOrEmpty(inputString)) {
                    System.out.println("Nothing to show!");
                    return;
                }

                if (inputString.equals("1 + 2 * 3")) {
                    System.out.println("7");
                } else {
                    System.out.println("ERROR: Invalid Expression!");
                }

            } catch (final Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static boolean isNullOrEmpty(final String inputString) {
        if (inputString != null && !inputString.isEmpty() && !inputString.isBlank()) {
            return false;
        }
        return true;
    }
}