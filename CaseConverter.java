package caseconverter;

import java.util.Scanner;

public class CaseConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        String word = input.nextLine();
        
        System.out.println("Please choose the case you want to convert: ");
        System.out.println("1. '1' or 'L' for lowercase");
        System.out.println("2. 'u' or 'U' for uppercase");
        System.out.println("3. 't' or 'T' for titlecase");
        char caseType = input.nextLine().charAt(0);
        
        System.out.printf("\nOriginal word %25s%s\n", ':', word);
        System.out.printf("Calling the first convertCase method %2s%s\n", ':', convertCase(word));
        System.out.printf("Calling the second convertCase method %s%s\n", ':', convertCase(word, caseType));
    }
    
    private static String toTitleCase(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
    }
    
    public static String convertCase(String word) {
        return toTitleCase(word);
    }
    
    public static String convertCase(String word, char caseType) {
        caseType = Character.toLowerCase(caseType);
        
        if (caseType == 'l') {
            return word.toLowerCase();
        } else if (caseType == 'u') {
            return word.toUpperCase();
        } else if (caseType == 't') {
            return toTitleCase(word);
        } else {
            return "Invalid case type.";
        }
    }
}
