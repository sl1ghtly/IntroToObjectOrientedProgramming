/* Practical P06B- Oblong Class
Eryk Gloginski
03/03/2021
Program Oblong Class .*/

public class Oblong
{
	// instance variables
	private double height;
	private double width;

	//constructors
	public Oblong()
	{
		height = 0;
		width = 0;
	}

	public Oblong(double heightIn, double widthIn)
	{
		height = heightIn;
		width = widthIn;
	}

	// methods
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
	
	//accessSpec returnType name(arg_list)
	public void grow(double wAmt, double hAmt)
	{
		width = width + wAmt; //width = width + wAmt;
		height = height + hAmt;
	}


}// end of class