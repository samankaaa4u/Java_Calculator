/* 
    Follow the same steps asin Exercise 2, but change the step 2 to ask the user for input forthese values
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
        System.out.println("4. Divition");
 
        // Declaring Scanner to create input
        Scanner sc = new Scanner(System.in);

        System.out.print("> ");
        operator = sc.nextInt();

        while (true) {
                // If else statement for letting user choose operator from whatever he/she wants
                if (operator == 1) {
                    // Prompt user for First Number and Second Number
                    System.out.print("First Number: ");
                    x = sc.nextFloat();
            
                    System.out.print("Second Number: ");
                    y = sc.nextFloat();
                    
                    // Executing the operator
                    System.out.println("Result is: " + (x + y));
                }

                else if (operator == 2) {
                    // Prompt user for First Number and Second Number
                    System.out.print("First Number: ");
                    x = sc.nextFloat();
            
                    System.out.print("Second Number: ");
                    y = sc.nextFloat();
                    
                    // Executing the operator
                    System.out.println("Result is: " + (x - y));
                }

                else if (operator == 3) {
                    // Prompt user for First Number and Second Number
                    System.out.print("First Number: ");
                    x = sc.nextFloat();
            
                    System.out.print("Second Number: ");
                    y = sc.nextFloat();
                    
                    // Executing the operator
                    System.out.println("Result is: " + (x * y));
                }

                else if (operator == 4) {
                    // Prompt user for First Number and Second Number
                    System.out.print("First Number: ");
                    x = sc.nextFloat();
            
                    System.out.print("Second Number: ");
                    y = sc.nextFloat();
                    
                    // Executing the operator
                    System.out.println("Result is: " + (x / y));
                }

                else{
                    // Warns users just in case if he/she inputs doesn't indicate the correct number
                    System.out.println("Invalid Input!");
                }

                // Prompt user for Trying again
                System.out.println("Try again? Type 1 if yes | Type 2 if no");
                System.out.print("> ");
                repeat = sc.nextInt();

                // If else statement for letting user choose options either 1 or 2
                if (repeat == 1) {
                    System.out.println("Choose Operator:");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Divition");

                    System.out.print("> ");
                    operator = sc.nextInt();
                }
                
                else if (repeat == 2) {
                    break;                    
                }

                else{
                    System.out.println("Invalid Input! Please try again.");
                    System.out.print("> ");
                    repeat = sc.nextInt();
                }
            }
        }
}
