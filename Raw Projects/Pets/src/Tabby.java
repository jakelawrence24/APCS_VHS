
public class Tabby extends Cat{
	
	  private int numOfStripes;
	  
	  public Tabby (String catName, int weight)
	  {
	    super (catName,weight);
	  }
	  
	  public void setStripesAmount(int stripesAmount)
	  {
	    numOfStripes = stripesAmount;
	  }
	  
	  public String speak()  // overwrites speak in Dog
	  {
	    return "meooooooooooow, meoooooow... MEOW!!";
	  } 
	  
	  public String move()  // overwrites move in Dog
	  {
	    return  "stripey steps";
	  }
	  
	  public int numberOfStripes()
	  {
	    return numOfStripes;
	  }
}
