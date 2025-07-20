/*
 * Name: Angelo Burke
 * Date: July 19, 2025
 * Assignment: 4.2 Project Exception handling
 */
import java.util.Scanner; 
public class UserInput { 
    private static Scanner scanner = new Scanner(System.in); 
    public static double getValidDouble(String prompt) { 
        while (true) { 
            try { 
                System.out.print(prompt); 
                return Double.parseDouble(scanner.nextLine()); 
            } catch (NumberFormatException e) { 
                System.out.println("Invalid input. Please enter a valid number."); 
            } 
        } 
    } 

    public static boolean askToContinue() { 
        System.out.print("Do you want to try again? (yes/no): "); 
        String response = scanner.nextLine().trim().toLowerCase(); 
        return response.equals("yes") || response.equals("y"); 
    } 
} 