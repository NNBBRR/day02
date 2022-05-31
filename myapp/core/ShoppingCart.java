package myapp.core;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {

        // Get the console
        Console cons = System.console();
        boolean stop = false;
        String input;
        List<String> cart = new LinkedList<>();
        int delIndex;

        // main loop
        while (!stop){
            input = cons.readLine(">");

            System.out.printf("READ: %s\n", input);
            // List of space seperated items

            String[] terms = input.split(" ");

            switch (terms[0]) {
                case "add":
                    break;

                case "list":
                     if (cart.size()) > 0) {
                         for (int i =0; i < cart.size(); i++) {
                            System.out.printf("%d, %s\n", (i+1), cart.get(i); 
                         }
                     } else {
                        System.out.println("Your cart is empty");
                     }
                     break;

                case "del":
                     if (terms.length > 2) {
                     System.err.println("Please provide an Index"); }

                     else {
                         delIndex = Integer.parseInt(terms[1]) - 1; 
                         if (delIndex < cart.size()) {
                             cart.remove(delIndex);
                             System.out.println("Deleted");

                         }
                        }
                        break;
                     

            } 
        




        System.out.println("Welcome to your shopping cart");

        
       






}