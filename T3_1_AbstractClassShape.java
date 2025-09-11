package dailyTasks;

abstract class Shape          // abstract class 
{

  public abstract double area();  // abstract method
  public void displayShape(String shapeName)     //non abstract method  
  
  {
      System.out.println("This is a " + shapeName);
  }
}

class Circle extends Shape         // Circle class
{
	double radius;
	
	Circle(double radius)          // constructor
	{
        this.radius = radius;
    }
	                               // implementing area()
    public double area()
    {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape       // Rectangle class
{
	double length, width;
	
	Rectangle(double length, double width)    // Constructor
	{
		this.length=length;
		this.width=width;
	}
	public double area()                    // implementing area()
	{
		return length * width;
	}
	
	public class T3_1_AbstractClassShape
	{
		 public static void main(String[] args)
		 {
			    Shape c = new Circle(5);
		        c.displayShape("Circle");
		        System.out.println("Area = " + c.area());

		        Shape r = new Rectangle(4, 6);
		        r.displayShape("Rectangle");
		        System.out.println("Area = " + r.area());
		 }
	}
	
	
}


