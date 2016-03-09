
public class Orange extends Cat{
	
	  private int tailLength;
	  
	  public Orange (String catName, int weight)
	  {
	    super (catName,weight);
	  }
	  
	  public void setTailLength(int tL)
	  {
	    tailLength = tL;
	  }
	  
	  public String speak()  // overwrites speak in Dog
	  {
	    return "miiiiiiiiiiooow!!";
	  } 
	  
	  public String move()  // overwrites move in Dog
	  {
	    return  "tiger like steps";
	  }
	  
	  public int lengthOfTail()
	  {
	    return tailLength;
	  }
}
