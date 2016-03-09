/*
 * Author: Jake Lawrence
 * Date: November 17, 2015
 */

import java.io.*;
import java.util.StringTokenizer;

public class WeeklyPay {
	// variables necessary for file input
	  private static FileInputStream inFile;
	  private static InputStreamReader inReader;
	  private static  BufferedReader reader;

	  //  StringTokenizer variable used to separate line into different data elements
	  private static StringTokenizer strTkn;

	  // program variables to hold data
	  private static String line,name,informalName;
	  private static char fInitial;
	  private static double totalRegHours, totalOverHours, wage, totalPay;
	  
	  private static int i,indOfA;
	  
	  // throws IOException will have the operating system handle any problems
	  // that may occur while attempting to acquired data from the file.
	  
	  public static void main (String args[]) throws IOException
	  {

	    initFile();  
	    getData();
	    calcTotal();
	    printResults();
	    
	    // closing the data file
	    inFile.close();
	  }
	  
	 
	 // preparing the file for input
	 
	  public static void initFile() throws IOException
	  {
	    inFile = new FileInputStream ("/Users/jakelawrence/Documents/\\!\\!VHS/\\!\\!VHSAPCSData/VHSP35data1.txt"); // notice the double slash marks
	    inReader = new InputStreamReader(inFile);
	    reader = new BufferedReader(inReader);
	  }
	  
	  
	  //data acquisition method
	  
	  public static void getData() throws IOException
	  {
	    line = reader.readLine();   //acquiring the data line as a string
	    System.out.println ("data line = " + line ); // view data line as one string
	    System.out.println();
	    
	    strTkn = new StringTokenizer(line);  // attaching the string tokenizer to the line
	    
	    // placing the first words in the dataline into a string variable    
	    name = strTkn.nextToken();
	    name += strTkn.nextToken();
	    //uses charAt method
	    fInitial = name.charAt(0);
	    //uses compareTo method
	    i = name.compareTo("Kermit D.Frogge");
	    
	    //uses equals, substring, replace, and length methods
	    if(name.equals("Kermit D.Frogge")){
	    	name = name.replace('K','P') + name.substring(1, name.length() + 1);
	    	//uses toLowerCase and trim methods
	    	informalName = name.toLowerCase().trim();
	    }
	    //uses toUpperCase and indexOf methods
	    indOfA = (name.toUpperCase()).indexOf("A"); 
	     
	    // extracting the parts of the line into separatedouble variables
	    wage = Double.parseDouble(strTkn.nextToken());
	    
	    totalRegHours += Double.parseDouble(strTkn.nextToken());
	    totalOverHours += Double.parseDouble(strTkn.nextToken());
	    
	    totalRegHours += Double.parseDouble(strTkn.nextToken());
	    totalOverHours += Double.parseDouble(strTkn.nextToken());
	    
	    totalRegHours += Double.parseDouble(strTkn.nextToken());
	    totalOverHours += Double.parseDouble(strTkn.nextToken());
	    
	    totalRegHours += Double.parseDouble(strTkn.nextToken());
	    totalOverHours += Double.parseDouble(strTkn.nextToken());
	    
	    totalRegHours += Double.parseDouble(strTkn.nextToken());
	    totalOverHours += Double.parseDouble(strTkn.nextToken());
	  }
	  
	  public static void calcTotal(){
		  totalPay = (totalRegHours + (totalOverHours * 1.5)) * wage;
	  }
	  
	  public static void printResults(){
		  System.out.println("Total pay for this week: $" + totalPay);
	  }
	   
}
	   
	   


