
public class Bird extends AbstrPets 
{
	   private int weight;
	   
	   public Bird (String birdName, int birdWeight)
	   {
	    super (birdName);  //  invokes the concrete constructor in the 
	                      // abstract class  AbstrPets
	    weight = birdWeight;
	  }
	  
	  public int getWeight()
	  {
	    return weight;
	  }
	  
	  public String toString()  // the closest toString method to the object
	                            // is in play.  If this toString was absent,
	                            // the obejct would use the toString in super.
	  {
	    return (super.toString() + " is a bird, weighing " + weight + " pounds");
	  }
	  
	  public String speak()  // defines abstract method speak for Dog
	  {
	    return "tweet!";
	  } 
	  
	  public String move()  // defines abstract method  move  for Dog
	  {
	    return  "fly";
	  }
	  
	  
}