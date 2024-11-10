package modulochecker;

import java.util.Scanner;

public class ModuloChecker {

    //Method 1: main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Please enter a number and a base, separated by space: "); 
        int num = input.nextInt(); 
        int base = input.nextInt(); 

        System.out.printf("\n%d is %sdivisible by 3%n", num, isDivisible(num) ? "" : "not "); 
        System.out.printf("%d is %sdivisible by %d%n", num, isDivisible(num, base) ? "" : "not ", base); 

        System.out.print("\nPlease enter an English letter: "); 
        char letter = input.next().charAt(0); 

        System.out.print("Please enter a number base and an English letter base, separated by space: "); 
        int numberBase = input.nextInt(); 
        char letterBase = input.next().charAt(0); 
        
        System.out.printf("\n'%c' is %sdivisible by 3%n", letter, isDivisible(letter) ? "" : "not "); 
        System.out.printf("'%c' is %sdivisible by %d%n", letter, isDivisible(letter, numberBase) ? "" : "not ", numberBase); 
        System.out.printf("'%c' is %sdivisible by '%c'%n", letter, isDivisible(letter, letterBase) ? "" : "not ", letterBase);
    }
    
    // Method 2: Converts an English letter to a number 
    public static int letterToNumber(char c) { 
        c = Character.toLowerCase(c); 
        return c - 'a'; 
    }

    // Method 3: Checks if a number is divisible by 3 
    public static boolean isDivisible(int num) { 
        return num % 3 == 0; 
    } 

    // Method 4: Checks if a number is divisible by a specified base 
    public static boolean isDivisible(int num, int base) { 
        return num % base == 0; 
    } 

    // Method 5: Checks if the numeric value of a letter is divisible by 3 
    public static boolean isDivisible(char letter) { 
        int num = letterToNumber(letter); 
        return isDivisible(num); 
    } 

    // Method 6: Checks if the numeric value of a letter is divisible by a specified base 
    public static boolean isDivisible(char letter, int base) { 
        int num = letterToNumber(letter); 
        return isDivisible(num, base); 
    } 

    // Method 7: Checks if the numeric value of a letter is divisible by the numeric value of another letter 
    public static boolean isDivisible(char letter, char base) { 
        int num1 = letterToNumber(letter); 
        int num2 = letterToNumber(base); 
        return isDivisible(num1, num2);
    } 
}