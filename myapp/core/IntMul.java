package myapp.core;

import java.io.Console;

public class IntMul {
    public static void main(String[] args) {

        // Get the console
        Console cons = System.console();

        // Variable to hold result
        String input = "ABC";
        int operand = 0;
        int result = 0;

        // control the loop
        boolean stop = false;

        while (!stop){
            input = cons.readLine("Enter a number, blank to end");
            if (input.length () > 0) {
                operand = Integer.parseInt(input);
                result += operand;

            }

            else
            stop = true;

        }

    System.out.printf(" The result is %d\n", result);

    
}

}
