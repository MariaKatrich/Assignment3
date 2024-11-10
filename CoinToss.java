package cointoss;

import java.util.Scanner;
import java.util.Random;

class Coin { 
    private int headsCount; 
    private int tailsCount; 
    private Random random; 

    public Coin() { 
        headsCount = 0; 
        tailsCount = 0; 
        random = new Random(); 
    } 
    
    public boolean flip() { 
        return random.nextBoolean(); // Returns true for heads, false for tails 
    }

    public void tossCoin() { 
        if (flip()) { 
            headsCount++; 
            System.out.println("Result: Heads"); 
        } else { 
            tailsCount++; 
            System.out.println("Result: Tails"); 
        }
    } 

    public void displayResults() { 
        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount); 
    } 
}

public class CoinToss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Coin coin = new Coin(); 

        while (true) { 
            System.out.println("1. Toss Coin"); 
            System.out.println("2. Exit"); 
            System.out.print("Choice: "); 
            int choice = input.nextInt(); 

            if (choice == 1) { 
                coin.tossCoin(); 
                coin.displayResults(); 
            } else if (choice == 2) { 
                System.out.println("Exiting the program."); 
                break; 
            } else { 
                System.out.println("Invalid choice. Please select 1 or 2."); 
            } 
        } 
    } 
}
