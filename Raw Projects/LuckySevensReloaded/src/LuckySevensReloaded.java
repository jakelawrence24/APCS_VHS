/*
 * File: LuckySevensReloaded.java
 * ----------------------
 * Author: Jake Lawrence
 * Date: December 1, 2015
 * Medway HS
 * VHS-APCS
 * Mr. Mac
 */

/*LuckySevensReloaded.java
   Simulate the game of lucky sevens until all funds are depleted.
   1) Rules:
           roll two dice
           if the sum equals 7, win $4, else lose $1
   2) The inputs are:
           the amount of money the user is prepared to lose 
   3) Computations:
           use the random number generator to simulate rolling the dice
           loop until the funds are depleted 
           count the number of rolls
           averages the number of rolls per 100 simulations
   4) The outputs are:
           the average number of rolls it takes to deplete the funds
   */



import java.util.Scanner; 
import java.util.Random;

public class LuckySevensReloaded {    
    public static void main (String [] args) {
      Scanner reader = new Scanner(System.in);       
      Random generator = new Random();
      int die1, die2,       // two dice
          dollars,          // initial number of dollars (input) 
          count,            // number of rolls to reach depletion 
          avRolls;
      
      // Request the input       
      System.out.print("How many dollars do you have? ");       
      dollars = reader.nextInt();
      int iDollars = dollars;
      
      avRolls = 0;
      
      for(int i = 1; i <= 100; i++){  
      count = 0;
      
      // Loop until the money is gone 
      while (dollars > 0){          
          count++;
          
         // Roll the dice.          
          die1 = generator.nextInt (6) + 1; // 1-6  
          die2 = generator.nextInt (6) + 1; // 1-6

         // Calculate the winnings or losses  
         if (die1 + die2 == 7)
             dollars += 4;
         else
             dollars -= 1; 
    }
      //accumulates the sum of the rolls per simulation
      avRolls += count;
      //resets the value of dollars to the user inputed value
      dollars = iDollars;
      
      }
      //prints and averages the rolls per simulation
      System.out.println("The average number of rolls per simulation was " + avRolls / 100 + " rolls.");
    }
}