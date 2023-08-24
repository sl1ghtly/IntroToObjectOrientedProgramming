/* Practical P06A- Question 2
Eryk Gloginski
01/03/2021
Program P06AQ2 .*/

public class PairTester
{
   public static void main(String [] args)
   {
      Pair myPair = new Pair();
      
      // vars
      double number1 = 10;
      double number2 = 20;
      double newNumber1 = 100;
      double newNumber2 = 200;
      
      double ans1, ans2, ans3, ans4, ans5, ans6;
      
      myPair.setNum1(number1);
      myPair.setNum2(number2);
      
      
      System.out.println("Number 1: " + myPair.getNum1());
      System.out.println("Number 2: " + myPair.getNum2());
      
      ans1 = myPair.calcSum();
      ans2 = myPair.calcDifference();
      ans3 = myPair.calcProduct();
      ans4 = myPair.calcAverage();
      
      System.out.println("Sum of those two: " + ans1);
      System.out.println("Difference between those two: " + ans2);
      System.out.println("Product of those two: " + ans3);
      System.out.println("Average of those two: " + ans4);
      
      ans5 = myPair.findMax();
      ans6 = myPair.findMin();
      
      System.out.println("Bigger Number of those two: " + ans5);
      System.out.println("Smaller Number of those two: " + ans6);
      
      System.out.println();
      System.out.println();
      
      myPair.setNumOneAndTwo(newNumber1, newNumber2);

      System.out.println("New Number 1: " + myPair.getNum1());
      System.out.println("New Number 2: " + myPair.getNum2());
      
      ans1 = myPair.calcSum();
      ans2 = myPair.calcDifference();
      ans3 = myPair.calcProduct();
      ans4 = myPair.calcAverage();
      
      System.out.println("Sum of those two: " + ans1);
      System.out.println("Difference between those two: " + ans2);
      System.out.println("Product of those two: " + ans3);
      System.out.println("Average of those two: " + ans4);
      
      ans5 = myPair.findMax();
      ans6 = myPair.findMin();
      
      System.out.println("Bigger Number of those two: " + ans5);
      System.out.println("Smaller Number of those two: " + ans6);
      
      
   }
}