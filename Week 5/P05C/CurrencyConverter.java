/* Practical P05C- Converter Class
Eryk Gloginski
25/02/2020
Program Converter Class .*/

public class CurrencyConverter
{
   //instance variables
   private double stg;
   private double eur;
   private double exchangeRate;
   
   //methods
   public double toEuro(double sterling)
   {
      return eur = sterling / exchangeRate;
   }
   
   public double toSterling(double euro)
   {
      return stg = euro * exchangeRate;
   }
   
   public void setExchangeRate(double sterling)
   {
      exchangeRate = sterling / 1;
   }
   
   public double getExchangeRate()
   {
      return exchangeRate;
   }
}