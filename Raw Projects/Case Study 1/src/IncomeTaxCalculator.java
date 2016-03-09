/*Jake Lawrence
 * October 13 2015
 * Case study 1: an income tax calculator
Compute a person's income tax.
1) Significant constants
       tax rate
       standard deduction
       deduction per dependent
2) The inputs are:
       gross income 
       number of dependents 
3) Computations:
       net income = gross income - the standard deduction - 
                    a deduction for each dependent 
       income tax = is a fixed percentage of the net income 
4) The outputs are:
       the income tax.
*/

// Imports the Scanner class
import java.util.Scanner;

// initializes the class IncomeTaxCalculator
public class IncomeTaxCalculator{

  // driver for the class
  public static void main(String [] args){
   
      //initialization of constants
      final double TAX_RATE = 0.20;
      // There is a $10,000 standard deduction
      final double STANDARD_DEDUCTION = 10000.0;
      // There is a $2,000 standard deduction per dependent
      final double DEPENDENT_DEDUCTION = 2000.0;
      
      //initializes the user input mechanism
      Scanner reader = new Scanner(System.in);
      
      // initialization of variables
      // initializes the variable for the gross income
      double grossIncome;
      // initializes a variable called numDependenta
      int numDependents;
      // initializes a variable for the taxable income
      double taxableIncome;
      // initializes a variable for the income tax
      double incomeTax;
      
      //takes in the inputs
      // asks for the gross income
      System.out.print("Enter the gross income: ");
      // takes the input into grossIncome
      grossIncome = reader.nextDouble();
      //asks for the number of dependents
      System.out.print("Enter the number of dependents: ");
      // takes the input for dependents into numDependents
      numDependents = reader.nextInt();
      
      //calculates taxable income
      // gross income - 10000 - 2000 * numDependents
      taxableIncome = grossIncome - STANDARD_DEDUCTION - DEPENDENT_DEDUCTION * numDependents;
      //calculates the income tax
      // taxable income * .2
      incomeTax = taxableIncome * TAX_RATE;
      
      // Prints "The income tax is $" + incomeTax
      System.out.println("The income tax is $" + incomeTax);
   }
}