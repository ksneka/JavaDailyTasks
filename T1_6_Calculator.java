package dailyTasks;

import java.util.Scanner;

public class T1_6_Calculator
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

      
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result;

     
        switch (operator)
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 == 0)
                {
                    System.out.println("Error! Division by zero.");
                } 
                else
                {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;

            case '%':
                if (num2 == 0)
                {
                    System.out.println("Error! Division by zero.");
                } 
                else 
                {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, /, or %.");
                break;
        }

    }
}
