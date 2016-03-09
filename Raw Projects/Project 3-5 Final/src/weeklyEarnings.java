/* Jake Lawrence
 * weeklyEarnings.java
 * October 22, 2015
 */
import java.util.Scanner;

//this class produces the weekly earnings based on hours worked and wage amount
public class weeklyEarnings {
	private static Scanner reader;

	//driver for the clas
	public static void main(String[] args){
		double wage;
		double sum;
		
		wage = takeWage();
		
		sum = calcMon();
		sum+=calcTue();
		sum+=calcWed();
		sum+=calcThu();
		sum+=calcFri();
		
		calcFin(sum,wage);
		
		
	}
	//takes the hourly wage of the user
	public static double takeWage(){
		reader = new Scanner(System.in);
		
		double wage;
		
		System.out.print("Enter your hourly wage: ");
		wage = reader.nextInt();
		
		return wage;
	}
	//calculates the hours that will be payed for on monday
	public static double calcMon(){
		Scanner reader = new Scanner(System.in);
		
		int rh;
		int oh;
		double th;
		
		System.out.print("Enter how many regular hours you worked on Monday: ");
		rh = reader.nextInt();
		System.out.print("Enter how many overtime hours you worked on Monday: ");
		oh = reader.nextInt();
		
		th = rh + (oh * 1.5);
		
		System.out.println("You will be or were payed for " + th + " hours on Monday\n");
		return th;
		
		
	}
	//calculates the hours that will be payed for on tuesday
	public static double calcTue(){
		Scanner reader = new Scanner(System.in);
		
		int rh;
		int oh;
		double th;
		
		System.out.print("Enter how many regular hours you worked on Tuesday: ");
		rh = reader.nextInt();
		System.out.print("Enter how many overtime hours you worked on Tuesday: ");
		oh = reader.nextInt();
		
		th = rh + (oh * 1.5);
		
		System.out.println("You will be or were payed for " + th + " hours on Tuesday\n");
		return th;
		
		
	}
	//calculates the hours that will be payed for on wednesday
	public static double calcWed(){
		Scanner reader = new Scanner(System.in);
		
		int rh;
		int oh;
		double th;
		
		System.out.print("Enter how many regular hours you worked on Wednesday: ");
		rh = reader.nextInt();
		System.out.print("Enter how many overtime hours you worked on Wednesday: ");
		oh = reader.nextInt();
		
		th = rh + (oh * 1.5);
		
		System.out.println("You will be or were payed for " + th + " hours on Wednesday\n");
		return th;
		
		
	}
	//calculates the hours that will be payed for on thursday
	public static double calcThu(){
		Scanner reader = new Scanner(System.in);
		
		int rh;
		int oh;
		double th;
		
		System.out.print("Enter how many regular hours you worked on Thursday: ");
		rh = reader.nextInt();
		System.out.print("Enter how many overtime hours you worked on Thursday: ");
		oh = reader.nextInt();
		
		th = rh + (oh * 1.5);
		
		System.out.println("You will be or were payed for " + th + " hours on Thursday\n");
		return th;
		
		
	}
	//calculates the hours that will be payed for on friday
	public static double calcFri(){
		Scanner reader = new Scanner(System.in);
		
		int rh;
		int oh;
		double th;
		
		System.out.print("Enter how many regular hours you worked on Friday: ");
		rh = reader.nextInt();
		System.out.print("Enter how many overtime hours you worked on Friday: ");
		oh = reader.nextInt();
		
		th = rh + (oh * 1.5);
		
		System.out.println("You will be or were payed for " + th + " hours on Friday\n");
		return th;
		
		
	}
	
	public static void calcFin(double sum, double wage){
		System.out.println("You will be or were payed for " + sum + " hours this week.");
		System.out.println("You will be or were payed " + (sum * wage) + " without taxes.");
	}

}
