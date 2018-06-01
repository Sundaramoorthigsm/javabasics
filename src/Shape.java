
public class Shape {
	double side;
	double length;
	double breadth;
	public Shape(double side) {
		this.side=side;
	}
	public Shape(double length,double breadth)
	
	{
		if(length>0.0 && length<20.0 && breadth>0.0 && breadth<20.0)
		{
			this.length = length;
			this.breadth = breadth;
		}
			else
			{
				System.out.println(" length should be 0.0 to 2.0");
			}
		}
		public double FindAreaofrectangle()
		
		{
			return length * breadth;
		}
			public static void main (String args[]) 
			{
			
			Shape square = new Shape(5);
			Shape rectangle = new Shape(5,3.9);
			System.out.println(rectangle.FindAreaofrectangle());
		}
	}
	
	
		

		
	


