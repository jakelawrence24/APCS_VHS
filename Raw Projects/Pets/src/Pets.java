// Adapted from Java Software Solutions by Lewis/Loftus/Cocking

// Demonstrates the useof Abstract Classes

// Instantiates objects of type pet and prints information
public class Pets
{
  public static void main(String Args[])
  {
    Dog fido =new Dog ("Fido", 45);
    Snake sam = new Snake("Sam", 6);
    
    System.out.println(fido);
    System.out.println(fido.getName() + " " + "says " + fido.speak());
    System.out.println(fido.move() + " " + fido.getName() + " " + fido.move());
    System.out.println();
    
    System.out.println(sam);
    System.out.println(sam.getName() + " " + "says " + sam.speak());
    System.out.println(sam.move() + " " + sam.getName() + " " + sam.move());
    System.out.println();
    
    
    Chihuahua pero  = new Chihuahua ("El Guapo", 2);
    pero.setPlace("Ciudad Juarez");
    System.out.println(pero + " from " + pero.cityOfOrigin());
    System.out.println(pero.getName() + " " + "says " + pero.speak());
    System.out.println(pero.move() + " " + pero.getName() + " " + pero.move());
    System.out.println();
    
    Poodle tiff = new Poodle("Tiffany", 24);
    tiff.setFavoriteFood("Chicken");
    System.out.println(tiff + " who loves " + tiff.getFavoriteFood());
    System.out.println(tiff.getName() + " " + "says " + tiff.speak());
    System.out.println(tiff.move() + " " + tiff.getName() + " " + tiff.move());
    System.out.println();
    
    Scary ty = new Scary("Tyler", 5, 65);
    ty.setScaryRating(8);
    System.out.println(ty + " who has a scary rating of " + ty.getScaryRating() + " on a 10 point scale ");
    System.out.println(ty.getName() + " says " + ty.speak());
    System.out.println(ty.move() + " " + ty.getName() + " " + ty.move());
    System.out.println();
    
    Tabby rox = new Tabby("Roxanne", 8);
    rox.setStripesAmount(9);
    System.out.println(rox + " who has " + rox.numberOfStripes() + " stripes");
    System.out.println(rox.getName() + " says " + rox.speak());
    System.out.println(rox.move() + " " + rox.getName() + " " + rox.move());
    System.out.println();
    
    Robin john = new Robin("John", 1);
    john.setWingspan(8);
    System.out.println(john + " who has a wingspan of " + john.wingspanLength() + " inches");
    System.out.println(john.getName() + " says " + john.speak());
    System.out.println(john.move() + " " + john.getName() + " " + john.move());
    System.out.println();
  }
}
    
     
   
