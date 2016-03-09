
public class Venomous extends Snake{
	
	  private int levelOfVenom;
	  
	  public Venomous (String snakeName, int length, int levelOfVenom)
	  {
	    super (snakeName,length);
	  }
	  //precondtion: the level of venom is 1-100
	  public void setLevelOfVenom(int lov)
	  {
	    levelOfVenom = lov;
	  }
	  
	  public String speak()  // overwrites speak in Dog
	  {
	    return "hiss, hiss, HISS!";
	  } 
	  
	  public String move()  // overwrites move in Dog
	  {
	    return  "vicious slithering";
	  }
	  
	  public int getVenomLevel()
	  {
	    return levelOfVenom;
	  }
}