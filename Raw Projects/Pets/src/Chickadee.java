
public class Chickadee extends Bird{
	
	  private int topSpeed;
	  
	  public Chickadee (String birdName, int weight)
	  {
	    super (birdName,weight);
	  }
	  
	  public void setTopSpeed(int ts)
	  {
	    topSpeed = ts;
	  }
	  
	  public String speak()  // overwrites speak in Dog
	  {
	    return "chirp chirp";
	  } 
	  
	  public String move()  // overwrites move in Dog
	  {
	    return  "soaring through the air";
	  }
	  
	  public int getTopSpeed()
	  {
	    return topSpeed;
	  }
}
