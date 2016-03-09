
public class Robin extends Bird{
	
	  private int wingspan;
	  
	  public Robin (String birdName, int weight)
	  {
	    super (birdName,weight);
	  }
	  //precondition: wingspan must be 5-60
	  public void setWingspan(int ws)
	  {
	    wingspan = ws;
	  }
	  
	  public String speak()  // overwrites speak in Dog
	  {
	    return "*whistle*";
	  } 
	  
	  public String move()  // overwrites move in Dog
	  {
	    return  "very fast flying";
	  }
	  
	  public int wingspanLength()
	  {
	    return wingspan;
	  }
}