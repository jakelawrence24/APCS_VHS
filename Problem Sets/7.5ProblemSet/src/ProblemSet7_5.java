/* Jake Lawrence
 * ProblemSet7_5.java
 * October 23, 2015
 */

//this class demonstrates various Math and String methods
public class ProblemSet7_5 {
	public static void main(String[] args){
	double a;
	int b;
	
	a = -3.14159;
	b = 3;
	
	System.out.println(Math.abs(a));
	System.out.println(Math.ceil(a));
	System.out.println(Math.floor(a));
	System.out.println(Math.max( (int) a, b));
	System.out.println(Math.min( (int) a, b));
	
	int ch, beginIndex, endIndex;
	
	char oldChar, newChar;
	
	String str, str2;
	
	str = "I am a lazy boy. My favorite number is 3.14159";
	str2 = "";
	
	ch = 3;
	beginIndex = 2;
	endIndex = 9;
	
	oldChar = ' ';
	newChar = '_';
	
	System.out.println(str.indexOf("m"));
	System.out.println(str.length());
	System.out.println(str.isEmpty());
	System.out.println(str2.isEmpty());
	System.out.println(str.substring(beginIndex, endIndex));
	System.out.println(str.replace(oldChar, newChar));
	
	
	}
	
	
	

}
