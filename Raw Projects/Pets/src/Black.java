
public class Black extends Cat{
	
		  private int badLuck;
		  
		  public Black (String catName, int weight)
		  {
		    super (catName,weight);
		  }
		  //badLuck can be 1-10
		  public void setBadLuck(int bL)
		  {
		    badLuck = bL;
		  }
		  
		  public String speak()  // overwrites speak in Dog
		  {
		    return "mouuw.";
		  } 
		  
		  public String move()  // overwrites move in Dog
		  {
		    return  "unlucky little steps";
		  }
		  
		  public int amountOfBadluck()
		  {
		    return badLuck;
		  }
}
		  
