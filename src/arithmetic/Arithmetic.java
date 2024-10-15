/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)         
    {
       
       ArithmeticBase arithmeticBase = new ArithmeticBase();
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter two numbers");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        
        System.out.println("Select an operation (PLUS, MINUS, MULTIPLY, DIVIDE): ");
        ArithmeticBase.Operation operation = ArithmeticBase.Operation.valueOf(scanner.next().toUpperCase());
        
        double result = arithmeticBase.calculate(num1, num2, operation);
        System.out.println("Result: " + result);
    
    }
}

