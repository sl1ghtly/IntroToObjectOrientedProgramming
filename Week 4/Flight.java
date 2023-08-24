import java.util.Scanner;

public class Flight {

   public static void main(String[] args)
   {
   // variable declaration
      int[][] seats = new int[10][5];
      int rowNo, seatNo;
      int fullBooking = 0; // var for full bookings
      int fullCancelling = 0; // var for full cancelling
      int booking = 0; // var for booking
      int cancelling = 0; // var for cancelling
      int mC; // Menu choice
      Scanner kIn = new Scanner(System.in);
      
      do{
         mC = getMenuChoice();
         switch (mC)
         {
            case 1: // view all seats
               System.out.println("\nSeat view");
               for (int outer = 0; outer < seats.length; outer++)
               {
                  for (int inner = 0; inner < seats[0].length; inner++) 
                  {
                     System.out.print(seats[outer][inner] + " ");
                     if (inner == 2)
                        System.out.print("\t"); //Aisle space
                  } // end inner for loop
                  System.out.println(); //skip line after row
               } // end outer for loop
               break;
            case 2: // Reset all seat bookings
               for (int outer = 0; outer < seats.length; outer++) 
               {
                  for (int inner = 0; inner < seats[0].length; inner++) 
                  {
                     seats[outer][inner] = 0;
                  }
               }
               fullCancelling++;
               break;
            case 3: // Fully book plane
               for (int outer = 0; outer < seats.length; outer++)
               {
                  for (int inner = 0; inner < seats[0].length; inner++)
                  {
                     seats[outer][inner] = 1;
                  }
               }
               fullBooking++;
               break;
            case 4: // Make a booking
               System.out.print("Enter Row number (1:10) : ");
               rowNo = kIn.nextInt();
               System.out.print("Enter Seat number (1:5) : ");
               seatNo = kIn.nextInt();
            
               if (seats[rowNo - 1][seatNo - 1] == 0)
               {
                  seats[rowNo - 1][seatNo - 1] = 1;
                  System.out.println("Booking confirmed. ");
                  booking++;
               }
               else
               {
                  System.out.println("Booking failed, seat not available. ");
               }
               break;
            case 5: // Cancel a booking
               System.out.print("Enter Row number (1:10) : ");
               rowNo = kIn.nextInt();
               System.out.print("Enter Seat number (1:5) : ");
               seatNo = kIn.nextInt();
            
               if (seats[rowNo - 1][seatNo - 1] == 1)
               {
                  seats[rowNo - 1][seatNo - 1] = 0;
                  System.out.println("Cancellation confirmed. ");
                  cancelling++;
               }
               else
               {
                  System.out.println("Cancellation failed, seat was not booked. ");
               }
               break;
            case 6: // Flight Statistics
               System.out.println("Times Fully Booked: " + fullBooking);
               System.out.println("Times Booked: " + booking);
               System.out.println("Times Fully Cancelled: " + fullCancelling);
               System.out.println("Times Cancelled: " + cancelling);
               break;
            default: // Exit System     
         } // end switch statement  
      }while(mC != 7);
   } // end main method



   public static int getMenuChoice()   
   {
      char choice;
      Scanner kIn = new Scanner(System.in);
      do{
         System.out.println("\nFlight Booking menu\n===================");
         System.out.println("1.  View all seats. ");
         System.out.println("2.  Reset all seat bookings. ");
         System.out.println("3.  Fully book plane. ");
         System.out.println("4.  Make a booking. ");
         System.out.println("5.  Cancel a booking. ");
         System.out.println("6.  Flight Statistics. ");
         System.out.println("7.  Exit System. ");
         System.out.print("\nEnter Choice: ");
         choice = kIn.nextLine().charAt(0);
      
         if(choice < '1' || choice > '7')
            System.out.println("\nInvalid choice, please choose a menu option (1-7) ");
      }while(choice < '1' || choice > '7');
      return Integer.parseInt(String.valueOf(choice));
      }
   } // end class