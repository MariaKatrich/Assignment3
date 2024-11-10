package simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Please enter two numbers, separated by space: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
       
        System.out.print("Please enter the operator (+, -, * or /): ");
        char oper = input.next().charAt(0);
       
        input.nextLine();
        System.out.print("Please enter a formula, e.g.: \"3.14 * 2\": ");
        String formula = input.nextLine();
       
        System.out.printf("\nCalling the first method   : %.2f + %.2f = %.2f", num1, num2, calcResult(num1,num2));
        System.out.printf("\nCalling the second method  : %.2f %c %.2f = %.2f", num1, oper, num2, calcResult(num1,num2,oper));
        System.out.printf("\nCalling the third method   : %s = %.2f%n", formula, calcResult(formula));
    }
   
    public static double calcResult(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
       
    }
   
    public static double calcResult(double num1, double num2, char oper) {
        if (oper == '+') {
            return num1 + num2;
        } else if ( oper == '-') {
            return num1 - num2;
        } else if ( oper == '*') {
            return num1 * num2;
        } else if ( oper == '/') {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Cannot divide by 0");
                return Double.NaN;
            }
        } else {
            return Double.NaN;
        }
    }
   
    public static double calcResult(String formula) {
        int firstSpace = formula.indexOf(" ");
        int secondSpace = formula.indexOf(" ", firstSpace + 1);
       
        String num1Str = formula.substring(0, firstSpace);
        String operStr = formula.substring(firstSpace + 1, secondSpace);
        String num2Str = formula.substring(secondSpace + 1);
       
        double num1 = Double.valueOf(num1Str);
        char oper = operStr.charAt(0);
        double num2 = Double.valueOf(num2Str);
       
        return calcResult(num1,num2,oper);
    } 
}
