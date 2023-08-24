/* Practical P11B- MobilePhoneTester Class
Eryk Gloginski
21/04/2021
Program MobilePhoneTester Class .*/

public class MobilePhoneTester
{
   public static void main(String [] args)
   { 
      MobilePhone phone1 = new MobilePhone();
      MobilePhone phone2 = new MobilePhone(10);
      MobilePhone phone3 = new MobilePhone(0.4, 0.2);
      MobilePhone phone4 = new MobilePhone(10, 0.4, 0.2);
      
      System.out.println("Phones:");
      System.out.println("Phone: 1, " + phone1.toString());
      phone1.makeCall();
      phone1.sendText();
      System.out.println();
      
      System.out.println("Phone: 2, " + phone2.toString());
      phone2.makeCall();
      phone2.sendText();
      System.out.println();
      
      System.out.println("Phone: 3, " + phone3.toString());
      phone3.makeCall();
      phone3.sendText();
      System.out.println();
      
      System.out.println("Phone: 4, " + phone4.toString());
      phone4.makeCall();
      phone4.sendText();
      System.out.println();
      
      System.out.println("Phones After: ");
      System.out.println("Phone: 1, " + phone1.toString());
      System.out.println("Phone: 2, " + phone2.toString());
      System.out.println("Phone: 3, " + phone3.toString());
      System.out.println("Phone: 4, " + phone4.toString());
      
   }
}