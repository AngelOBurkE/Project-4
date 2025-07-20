/*
 * Name: Angelo Burke
 * Date: July 19, 2025
 * Assignment: 4.2 Project Exception handling
 */
public class DisplayMessage { 
    public static void printHeader() { 
        System.out.println("Project Week 4: Division Application - Angelo Burke");  
    } 

    public static void printWelcome() { 
        System.out.println("\nThis is a divison calculator."); 
        System.out.println("Please enter your numbers below."); 
    } 

    public static void showResult(double num1, double num2, double result) { 
        System.out.printf("Result of %.2f ÷ %.2f = %.2f%n", num1, num2, result); 
    } 
    public static void printGoodbye() { 
        System.out.println("Thank you for using the divison calculator."); 
    } 
} 