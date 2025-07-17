/*
 * Name: Angelo Burke
 * Date: July 18, 2025
 * Assignment: 4.2 Project Exception handling
 */
public class App { 
    public static void main(String[] args) { 
        MessageDisplay.printHeader(); 
        boolean continueRunning = true; 
        while (continueRunning) { 
            MessageDisplay.printWelcome(); 
            double num1 = UserInput.getValidDouble("Enter the first number: "); 
            double num2; 
            while (true) { 
                num2 = UserInput.getValidDouble("Enter the second number: "); 
                if (num2 == 0) { 
                    System.out.println("Error: Cannot divide by zero. Please try again."); 
                } else { 
                    break; 
                } 
            } 
            double result = MathOperations.divide(num1, num2); 
            MessageDisplay.showResult(num1, num2, result); 
            continueRunning = UserInput.askToContinue(); 
        } 
        MessageDisplay.printGoodbye(); 
    } 
} 