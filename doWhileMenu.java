package JavaPrograms;
import java.io.*;

// Using a do-while loop to process a menu
public class doWhileMenu {
    public static void main(String[] args) throws java.io.IOException {
        char choice; // Declare the choice variable
        
        do {
            System.out.println("Help on");
            System.out.println(" 1. If");
            System.out.println(" 2. Switch");
            System.out.println(" 3. While");
            System.out.println(" 4. do-While");
            System.out.println(" 5. For");
            System.out.print("Choose any one (1-5): ");
            
            choice = (char) System.in.read();  // Read the user input
            
            // Consume the newline character after reading the choice
            System.in.read(); 

        } while (choice < '1' || choice > '5');  // Check if the choice is between '1' and '5'

        System.out.println();
        
        // Switch statement to show the explanation based on the choice
        switch (choice) {
            case '1':
                System.out.println("The if statement:");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            
            case '2':
                System.out.println("The switch statement:");
                System.out.println("switch (expression) {");
                System.out.println("  case constant:");
                System.out.println("    // statement sequence");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            
            case '3':
                System.out.println("The while statement:");
                System.out.println("while (condition) statement;");
                break;
            
            case '4':
                System.out.println("The do-while statement:");
                System.out.println("do {");
                System.out.println("  statement;");
                System.out.println("} while (condition);");
                break;
            
            case '5':
                System.out.println("The for statement:");
                System.out.println("for (initialization; condition; iteration) {");
                System.out.println("  statement;");
                System.out.println("}");
                break;
            
            default:
                // This should never be reached due to the do-while condition
                System.out.println("Invalid choice.");
        }
    }
}
