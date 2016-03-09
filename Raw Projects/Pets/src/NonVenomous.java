
public class NonVenomous extends Snake{
	
	  private String snakeColor;
	  
	  public NonVenomous (String snakeName, int length)
	  {
	    super (snakeName,length);
	  }
	  //precondition: the color must be on the ROYGBIV spectrum
	  public void setColor(String color)
	  {
	    snakeColor = color;
	  }
	  
	  public String speak()  // overwrites speak in Dog
	  {
	    return "rattle rattle hiss!";
	  } 
	  
	  public String move()  // overwrites move in Dog
	  {
	    return  "colorful slithering";
	  }
	  
	  public String getSnakeColor()
	  {
	    return snakeColor;
	  }
}
