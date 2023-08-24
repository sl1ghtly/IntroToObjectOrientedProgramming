/* Practical P07B- Oblong Class
Eryk Gloginski
09/03/2021
Program Oblong Class .*/

public class Oblong
{
	// instance variables
	private double height;
	private double width;

	//constructor
	public Oblong()
	{
		height = 0.0;
		width = 0.0; 
	}
	
	public Oblong(double widthIn, double heightIn)
	{
		if(heightIn > 0)  //if its +ve
			height = heightIn;
		else 
			height = 0; 
		
		if(widthIn > 0)
			width = widthIn;
		else 
			width = 0;	
	}

	// methods
   
   public String toString()
   {
      String str = new String();
      str = str + "Height: " + height + " | Width: ";
      str = str + width;
      return str;
   }
   
   public boolean equals(Oblong anotherOblong)
   {
      return(height == anotherOblong.height
      && width == anotherOblong.width);
   }
   
	public double getHeight()
	{	
		return height;		
	}

	public double getWidth()
	{	
		return width;		
	}

	public void setWidth(double widthIn)
	{	
		width = widthIn;
	}

	public void setHeight(double heightIn)
	{	
		height = heightIn;
	}
	
	public double calculateArea()
	{	
		return width * height;
	}	
	
	public double calculatePerim()
	{	
		return (width + height) * 2;
	}	
	
	public boolean isSquare()
	{
		return width == height;
	}
	
	public void increaseSize(double widthAmt, double heightAmt)
	{
		width = width + widthAmt; 
		height = width + heightAmt;
	}


}// end of class