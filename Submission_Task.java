/* 
    Follow the same steps in Exercise 2, but change the step 2 to ask the user for input forthese values
    by using Scanner class.
*/

import java.util.Scanner;

public class Submission_Task {

    public static void main(String[] args) {
        // Declaring Variables
        float operator, x, y;
        int repeat;

        // Intro
        System.out.println("Choose Operator:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Declaring Scanner to create input
        Scanner sc = new Scanner(System.in);

        System.out.print("> ");
        try {
            operator = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Invalid Input! Please enter a number.");
            return;
        }

        // If else statement for letting user choose operator from whatever he/she wants
        if (operator == 1) {
            // Prompt user for First Number and Second Number
            try{
                System.out.print("First Number: ");
                x = sc.nextFloat();

                System.out.print("Second Number: ");
                y = sc.nextFloat();

                // Executing the operator
                System.out.println("Result is: " + (x + y));
            }

            catch (Exception e) {
                System.out.println("Invalid Input! Please enter a number.");
                return;
            }
        }

        else if (operator == 2) {
            try{
                // Prompt user for First Number and Second Number
                System.out.print("First Number: ");
                x = sc.nextFloat();

                System.out.print("Second Number: ");
                y = sc.nextFloat();

                // Executing the operator
                System.out.println("Result is: " + (x - y));
            }

            catch (Exception e) {
                System.out.println("Invalid Input! Please enter a number.");
                return;
            }
        }

        else if (operator == 3) {
            try{
                // Prompt user for First Number and Second Number
                System.out.print("First Number: ");
                x = sc.nextFloat();

                System.out.print("Second Number: ");
                y = sc.nextFloat();

                // Executing the operator
                System.out.println("Result is: " + (x * y));
            }


            catch (Exception e) {
                System.out.println("Invalid Input! Please enter a number.");
                return;
            }
        }

        else if (operator == 4) {
            try{
                // Prompt user for First Number and Second Number
                System.out.print("First Number: ");
                x = sc.nextFloat();

                System.out.print("Second Number: ");
                y = sc.nextFloat();

                // Executing the operator
                System.out.println("Result is: " + (x / y));
            }

            catch (Exception e) {
                System.out.println("Invalid Input! Please enter a number.");
                return;
            }
        }

        // Prompt user for Trying again
        try{
            System.out.println("Try again? Type 1 if yes | Type 2 if no");
            System.out.print("> ");
            repeat = sc.nextInt();
        }
        
        catch (Exception e) {
            System.out.println("Invalid Input! Please enter a number.");
            return;
        }

        // If else statement for letting user choose options either 1 or 2
        while (repeat != 1 && repeat != 2) {
            try{
                System.out.println("Invalid Input! Please try again.");
                System.out.println("Try again? Type 1 if yes | Type 2 if no");
                System.out.print("> ");
                repeat = sc.nextInt();
            }

            catch (Exception e) {
                System.out.println("Invalid Input! Please enter a number.");
                return;
            }

            if (repeat == 1) {
                try{
                    System.out.println("Choose Operator:");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
        
                    System.out.print("> ");
                    operator = sc.nextInt();
                }
                
                catch (Exception e) {
                    System.out.println("Invalid Input! Please enter a number.");
                    return;
                }
            }

            else{
                break;
            }
        }
    }
}