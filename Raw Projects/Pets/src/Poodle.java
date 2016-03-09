public class Poodle extends Dog {
	
		  private String favoriteFood;
		  
		  public Poodle (String dogName, int weight)
		  {
		    super (dogName,weight);
		  }
		  
		  public void setFavoriteFood(String ff)
		  {
		    favoriteFood = ff;
		  }
		  
		  public String speak()  // overwrites speak in Dog
		  {
		    return "bow wow!!";
		  } 
		  
		  public String move()  // overwrites move in Dog
		  {
		    return  "glorious long strides";
		  }
		  
		  public String getFavoriteFood()
		  {
		    return favoriteFood;
		  }  
		  
		

}
