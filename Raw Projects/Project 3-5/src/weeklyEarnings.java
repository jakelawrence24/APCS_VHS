/* Jake Lawrence
 * weeklyEarnings.java
 * October 15, 2015
 */
import java.util.Scanner;

//this class produces the weekly earnings based on hours worked and wage amount
public class weeklyEarnings {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		//hourly wage
		double wage;
		
		//regular time monday
		double rhmo;
		//overtime monday
		double otmo;
		//sum of hours monday
		double summo;
		
		//regular time tuesday
		double rhtu;
		//overtime tuesday
		double ottu;
		//sum of hours tuesday
		double sumtu;
		
		//regular time wednesday
		double rhwe;
		//overtime wednesday
		double otwe;
		//sum of hours wednesday
		double sumwe;
		
		//regular time thursday
		double rhth;
		//overtime thursday
		double otth;
		//sum of hours thursday
		double sumth;
		
		//regular time friday
		double rhfr;
		//overtime friday
		double otfr;
		//sum of hours friday
		double sumfr;
		
		//sum of hours in week
		double sum;
		
		System.out.print("Enter your hourly wage: ");
		wage = reader.nextDouble();
		
		System.out.print("Enter the amount of regular hours you worked on Monday: ");
		rhmo = reader.nextDouble();
		System.out.print("Enter the amount of overtime hours you worked on Monday: ");
		otmo = 1.5 * reader.nextDouble();
		summo = rhmo + otmo;
		
		System.out.print("Enter the amount of regular hours you worked on Tuesday: ");
		rhtu = reader.nextDouble();
		System.out.print("Enter the amount of overtime hours you worked on Tuesday: ");
		ottu = 1.5 * reader.nextDouble();
		sumtu = rhtu + ottu;
		
		System.out.print("Enter the amount of regular hours you worked on Wednesday: ");
		rhwe = reader.nextDouble();
		System.out.print("Enter the amount of overtime hours you worked on Wednesday: ");
		otwe = 1.5 * reader.nextDouble();
		sumwe = rhwe + otwe;
		
		System.out.print("Enter the amount of regular hours you worked on Thursday: ");
		rhth = reader.nextDouble();
		System.out.print("Enter the amount of overtime hours you worked on Thursday: ");
		otth = 1.5 * reader.nextDouble();
		sumth = rhth + otth;
		
		System.out.print("Enter the amount of regular hours you worked on Friday: ");
		rhfr = reader.nextDouble();
		System.out.print("Enter the amount of overtime hours you worked on Friday: ");
		otfr = 1.5 * reader.nextDouble();
		sumfr = rhfr + otfr;
		
		sum = summo + sumtu + sumwe + sumth + sumfr;
		
		System.out.println("\nMonday Total: " + (summo * wage));
		System.out.println("\nTuesday Total: " + (sumtu * wage));
		System.out.println("\nWednesday Total: " + (sumwe * wage));
		System.out.println("\nThursday Total: " + (sumth * wage));
		System.out.println("\nFriday Total: " + (sumfr * wage));
		System.out.print("\nWeekly total: " + (sum * wage));
		
	}

}
