/* CA2
Eryk Gloginski - L00157413
22/04/2021
Java Class AirBnBBooking*/

public class AirBnBBooking
{
   // instance variables
   private int amountNights;
   private String address;
   private int amountOccupants;
   private double costPerNight;
   private String propertyType;
   private boolean petsAllowed;
   private String creditCardNumber;
   private static char taxCategory;
   
   // constructors
   public AirBnBBooking(int nightsIn, String addressIn, int occupantsIn, double costIn)
   {
      creditCardNumber = "0000000000000000";
      amountNights = nightsIn;
      address = addressIn;
      amountOccupants = occupantsIn;
      costPerNight = costIn;
      propertyType = "Apartment";
      petsAllowed = false;
   }
   
   public AirBnBBooking(int nightsIn, String addressIn, int occupantsIn, double costIn, String propertyIn, boolean petsIn)
   {
      creditCardNumber = "0000000000000000";
      amountNights = nightsIn;
      address = addressIn;
      amountOccupants = occupantsIn;
      costPerNight = costIn;
      propertyType = propertyIn;
      petsAllowed = petsIn;
   }
   
   // get cost per night
   public double getCostPerNight()
   {
      return costPerNight;
   }
   
   // get pets allowed value
   public boolean getPetsAllowed()
   {
      return petsAllowed;
   }
   
   // set cost per night
   public void setCostPerNight(double costIn)
   {
      costPerNight = costIn;
   }
   
   // calculate total booking price
   public double getTotalBookingPrice()
   {
      return (amountNights * amountOccupants) * costPerNight;
   }
   
   // set credit card num
   public void setCreditCard(String creditNumIn)
   {
      creditCardNumber = creditNumIn;
   }
   
   // get credit card value
   public String getCreditCard()
   {
      return "************" + creditCardNumber.substring(creditCardNumber.length() - 4);
   }
   
   // set tax category for all instances of AirBnBBooking
   public static void setTaxCategory(char taxCharIn)
   {
      taxCategory = taxCharIn;
   }
   
   // toString method
   public String toString()
   {
      String str = new String();
      str = str + "\nCredit Card Number: " + creditCardNumber.substring(creditCardNumber.length() - 4);
      str = str + "\nAmount of Nights: " + amountNights;
      str = str + "\nAddress: " + address;
      str = str + "\nAmount Of Occupants: " + amountOccupants;
      str = str + "\nCost Per Night: " + costPerNight;
      str = str + "\nProperty Type: " + propertyType;
      str = str + "\nAre Pets Allowed? " + petsAllowed;
      str = str + "\nTax Class: " + taxCategory;
      return str;
   }
   
   // equals method
   public boolean equals(AirBnBBooking a)
   {
      return creditCardNumber == a.creditCardNumber
         && amountNights == a.amountNights
         && address == a.address
         && amountOccupants == a.amountOccupants
         && costPerNight == a.costPerNight
         && propertyType == a.propertyType
         && petsAllowed == a.petsAllowed;
   }
}