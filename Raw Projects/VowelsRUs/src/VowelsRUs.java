/*
 * Jake Lawrence
 * December 9, 2015
 * VHS APCS
 * Medway HS
 * 
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VowelsRUs {
	
		// variables necessary for file input
		  private static FileInputStream inFile;
		  private static InputStreamReader inReader;
		  private static  BufferedReader reader;
		  //  StringTokenizer variable used to separate line into different data elements
		  private static StringTokenizer strTkn;
		  
		  
	//driver for the class
	public static void main(String[] args) throws IOException{
		//takes in file
		initFile(); 
		//extracts data from the file
	    getData();
	    // closing the data file
	    inFile.close();
	}
	
	//takes in file
	public static void initFile() throws IOException{
	    inFile = new FileInputStream ("/Users/jakelawrence/Documents/VHS/VHSAPCSData/vowels.txt"); // notice the double slash marks
	    inReader = new InputStreamReader(inFile);
	    reader = new BufferedReader(inReader);
	  }
	  
	  //data acquisition method
	  public static void getData() throws IOException{
		  //ostring is the original string, line is the line the reader is taking in, 
		  //and suffix is the suffix produced
		  String line, oString, suffix;
		  line = reader.readLine();
		  //reads the .txt file until it is finished
		  while(line != null){
			  strTkn = new StringTokenizer(line);  // attaching the string tokenizer to the line
			  // original string assignment
			  oString = strTkn.nextToken();
			 // suffix assignment
			  suffix = strTkn.nextToken();
			  //reads next line
			  line = reader.readLine();
			  //assigns and identifies data to certain variables
			  assignData(oString,suffix);
			  
		  }   
	  }
	  // gives various data to certain variables
	  public static void assignData(String oString, String suffix){
		  char wtype,stype;
		  String plural;
		  //sets the word type of the given word
		  wtype = identifyType(oString);
		  //creates the plural of the given word
		  plural = formPlural(oString,wtype);
		  //identifies the suffix type of the given word
		  stype = identifyCType(suffix);
		  //creates the new suffix from the given variables
		  suffix = formSuffix(oString,suffix,wtype,stype);		  
		  //outputs results
		  printResults(oString, plural, suffix);
	  }
	  // prints the final result
	  public static void printResults(String oString, String plural, String suffix){
		  
		  System.out.println("Orginal String: " + oString + "\nPlural: " + plural + "\nSuffix: " + suffix);
		  
	  }
	  // forms the plural of the given string
	  public static String formPlural(String oString, char wtype){
		  
		  String plural;
		  //if the word  ends in a single consonant
		  if(wtype == 'C'){
			  plural = oString + "GH";
			  //if the word ends in a vowel
		  }else if(wtype == 'V'){
			  //adds G to the end of the original string
			  plural = oString.substring(0,oString.length()-1) + 'G';
		  }else{
			  //adds the last letter once more and H to the end of the original string
			  plural = oString + oString.substring(oString.length()-1,oString.length()) + 'H';
		  }
		  
		  return plural;
	  }
	  //forms the suffix of the given string
	  public static String formSuffix(String oString, String suffix, char wtype, char stype){
		//if the word  ends in a single consonant
		  if(wtype == 'C'){
			  return (oString + suffix);
		  }else
			//if the word  ends in a single vowel
			  if(wtype == 'V'){
				  //if the suffix ends in a consonant
			  if(stype == 'C'){
				  //returns the original string with the first character and suffix added to the end of it
				  return (oString + suffix.charAt(0) + suffix);
			  }else{
				  //return the original string plus the substring of the suffix at index 1
				  return (oString + suffix.substring(1));
			  }
		  }else{
			//if the suffix ends in a consonant
			  if(stype == 'C'){
				  int j = oString.length();
				  //if the last character is a consonant
				  if(conson(oString.charAt(oString.length() - 1))){
					  //finds the last char with a consonant
					  for(int i = (oString.length() - 1); conson(oString.charAt(i)); i--){
						  //sets the index
						  j = i;
					  }
				  }else{
					  //finds the last char with a vowel
				  for(int i = (oString.length() - 1); !(conson(oString.charAt(i))); i--){
					  //sets the index
					  j = i;
				  }
				  }
				  //returns the ending combination of vowels
				  return(oString.substring(0, j) + oString.substring(j + 1) + suffix);
			  }else{
				  //returns the original string and the suffix's first char and the suffix concatenated together
				  return (oString + suffix.charAt(0) + suffix);
			  }
		  }
		  
		  
	  }
	  // identifies the type of a given string, used through many other methods
	  public static char identifyType(String oString){
		  //second to last char in the original string
		  char fChar =  oString.charAt(oString.length()-2);
		  //last char in the original string
		  char lChar =  oString.charAt(oString.length()-1);
		  //checks if the the original string ends in a single consonant
		  if(sC(fChar,lChar)){
			  return 'C';
		  }else 
			//checks if the the original string ends in a single consonant
			  if(sV(fChar,lChar)){
			  return 'V';
		  }else{
			  return 'D';
		  }
	  }
	  // identifies the type of a given character
	  public static char identifyCType(String suffix){
		  //if the suffix begins with a consonant
		  if(conson(suffix.charAt(0))){
			  return 'C';
		  }else{
			  return 'V';
		  }
	  }
	  // tells if a string ends in a single consonant
	  public static boolean sC(char fChar, char lChar){ 
		  return (!conson(fChar) && conson(lChar));
	  }
	  //tells if a character is a consonant
	  public static boolean conson(char iChar){
		  return (Character.toLowerCase(iChar) != 'a' && Character.toLowerCase(iChar) != 'c' && Character.toLowerCase(iChar) != 's' && Character.toLowerCase(iChar) != 'l');
		  
	  }
	  //tells if a string ends in a single vowel
	  public static boolean sV(char fChar, char lChar){ 
		  return (conson(fChar) && !conson(lChar));
	  }

}
