/* Jake Lawrence
 * kiloNaut.java
 * October 13 2015
 */

import java.util.Scanner;

public class kiloNaut {
 public static void main(String[] args){
  Scanner reader = new Scanner (System.in);
  
  double kilom;
  double na;
  
  
  System.out.print("Enter the number of kilometers: ");
  kilom = reader.nextDouble();
  
  //kilom * 1/ 10,00 = kilom * .0001 -> .001 * (90 * 60) = .54
  na = kilom * .54 ;
  
  System.out.println(kilom + " kilometers is " + na + " nautical miles.");
 }

}
