/* CA2
Eryk Gloginski - L00157413
22/04/2021
Java Class AirBnBBookingTester*/

import java.util.Scanner;

public class AirBnBBookingTester
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      AirBnBBooking airbnb1 = new AirBnBBooking(7, "19 Apple Street", 2, 12.50);
      AirBnBBooking airbnb2 = new AirBnBBooking(14, "34 Pineapple Street", 3, 10.50, "Semi Detached House", true);
      AirBnBBooking airbnb3 = new AirBnBBooking(5, "24 Pear Street", 3, 14.50);
      AirBnBBooking airbnb4 = new AirBnBBooking(5, "24 Pear Street", 3, 14.50);
      
      // basic methods for airbnb1
      System.out.println("Cost Per Night 1: " + airbnb1.getCostPerNight());
      airbnb1.setCostPerNight(13.50);
      System.out.println("New Cost Per Night 1: " + airbnb1.getCostPerNight());
      System.out.println("Pets Allowed? 1: " + airbnb1.getPetsAllowed());
      System.out.println("Total Booking Price 1: " + airbnb1.getTotalBookingPrice());
      airbnb1.setCreditCard("1111222233334444");
      System.out.println("Credit Card 1: " + airbnb1.getCreditCard());
      
      System.out.println();
      
      // basic methods for airbnb2
      System.out.println("Cost Per Night 2: " + airbnb2.getCostPerNight());
      airbnb2.setCostPerNight(11.50);
      System.out.println("New Cost Per Night 2: " + airbnb2.getCostPerNight());
      System.out.println("Pets Allowed? 2: " + airbnb2.getPetsAllowed());
      System.out.println("Total Booking Price 2: " + airbnb2.getTotalBookingPrice());
      airbnb2.setCreditCard("1234123412341234");
      System.out.println("Credit Card 2: " + airbnb2.getCreditCard());
      
      System.out.println();
      
      // tostring method
      System.out.println(airbnb1.toString());
      System.out.println(airbnb2.toString());
      System.out.println(airbnb3.toString());
      System.out.println(airbnb4.toString());
      
      System.out.println();
      
      // equals method
      
      // airbnb1 to airbnb2
      if (airbnb1.equals(airbnb2))
      {
         System.out.println("EQUALS");
      }
      else
      {
         System.out.println("DOES NOT EQUALS");
      }
      
      // airbnb3 to airbnb4
      if (airbnb3.equals(airbnb4))
      {
         System.out.println("EQUALS");
      }
      else
      {
         System.out.println("DOES NOT EQUALS");
      }
      
      // set tax category
      airbnb1.setTaxCategory('C');
      
      System.out.println(airbnb1.toString());
      System.out.println(airbnb2.toString());
      System.out.println(airbnb3.toString());
      System.out.println(airbnb4.toString());
      
   }
}