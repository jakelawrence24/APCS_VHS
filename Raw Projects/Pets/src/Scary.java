
public class Scary extends Venomous {

	private int scaryRating;
	  
	  public Scary (String snakeName, int length, int venomLevel)
	  {
	    super (snakeName,length, venomLevel);
	  }
	  //precondtion: the scary rating must be 1-10
	  public void setScaryRating(int sr)
	  {
	    scaryRating = sr;
	  }
	  
	  public String speak()  // overwrites speak in Dog
	  {
	    return "hiss, hiss, HISS!";
	  } 
	  
	  public String move()  // overwrites move in Dog
	  {
	    return  "vicious slithering";
	  }
	  
	  public int getScaryRating()
	  {
	    return scaryRating;
	  }
}
