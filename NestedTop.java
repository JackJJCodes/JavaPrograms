abstract class ShapeX
{
	public abstract void area();
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	private int x = 5;
	
	public class Circle1 extends ShapeX
	{
		double r;
		Circle1(double r)
		{
			this.r = r;
		}
		
		public void area()
		{
			System.out.println("Circle area = " + (3.14*r*r));
		}
	}
	
	public static class Rectangle extends ShapeX
	{
		int length;
		int breadth;
		Rectangle(int length, int breadth)
		{
			this.breadth = breadth;
			this.length = length;
		}
		public void area()
		{
			System.out.println("Rectangle area = " + length*breadth);
		}
	}
}


public class NestedTop 
{
	public static void main(String args[])
	{
		ShapeX aShape = new ShapeX.Rectangle(12, 13);
		aShape.area();
		
		ShapeX.Circle1 c1 = aShape.new Circle1(2.0);
		c1.area();
	}
}
