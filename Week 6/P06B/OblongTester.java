/* Practical P06B- OblongTester Class
Eryk Gloginski
03/03/2021
Program OblongTester Class .*/

public class OblongTester
{
   public static void main(String [] args)
   {  
   	// create an instance of type Oblong
   	Oblong myOblong = new Oblong();
	  	Oblong myOblong2 = new Oblong(20, 40);
	  
	  	// use methods to set instance variables
	   myOblong.setHeight(10);
   	myOblong.setWidth(20);
	   
	  	// use methods to retrieve values of instance variables
		System.out.println("Oblong 1: ");
	  	System.out.println("Width: " + myOblong.getWidth());
	  	System.out.println("Height: " + myOblong.getHeight());   
	   System.out.println("Area: " + myOblong.calculateArea());
		System.out.println();

		System.out.println("Oblong 2: ");
	  	System.out.println("Width: " + myOblong2.getWidth());
	  	System.out.println("Height: " + myOblong2.getHeight());   
	   System.out.println("Area: " + myOblong2.calculateArea());
         
   }
}