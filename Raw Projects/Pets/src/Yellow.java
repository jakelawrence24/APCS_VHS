
public class Yellow extends Cat{
	
	  private int meowsPerMinute;
	  
	  public Yellow (String catName, int weight)
	  {
	    super (catName,weight);
	  }
	  // meows per minute can be 1-30
	  public void setMeowsPerMinute(int mpm)
	  {
	    meowsPerMinute = mpm;
	  }
	  
	  public String speak()  // overwrites speak in Dog
	  {
	    return "Meow!!!";
	  } 
	  
	  public String move()  // overwrites move in Dog
	  {
	    return  "golden steps";
	  }
	  
	  public int MeowsPerMinuteRate()
	  {
	    return meowsPerMinute;
	  }
}