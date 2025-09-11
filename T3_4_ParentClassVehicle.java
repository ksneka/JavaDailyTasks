package dailyTasks;

class vehicle                                     // parent class
{
	void move()
	{
		System.out.println(" move carefully");
	}
}
	class Bike extends vehicle                   // child class
	{
		void move()
		{
			System.out.println("Bike is safe");
		}
	}
	 public class T3_4_ParentClassVehicle         // main class
	  {
		  public static void main (String[] args)
		  {
			 vehicle v1= new vehicle();
			 v1.move();
			 
			 Bike b1 = new Bike();        // child object
		        b1.move();                   // calls Bike's move()

		     vehicle v2 = new Bike();     // parent reference, child object
		        v2.move();  
		  }
}