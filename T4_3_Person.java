package dailyTasks;

class Person                //super class
{
	String name;           // fields
	int age; 

Person(String name, int age)          //constructor
{
	this.name=name;
	this.age=age;
}
void display()                         //method
{
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
}
class Empl extends Person            //sub class
{
	int EmployeeId;
	String Department;

Empl(String name, int age, int EmployeeId, String Department )  //constructor
{

super(name,age);
this.EmployeeId=EmployeeId;
this.Department=Department;

}
void displayEmployeeInfo()
{
	super.display();
	System.out.println("EmployeeId:" + EmployeeId);
	System.out.println("Department:"+ Department);
}

}
public class T4_3_Person                    //main class
{
	public static void main (String args[])
	{
		Empl emp1=new Empl("Sneka",21, 1001, "IT");
		emp1.displayEmployeeInfo();                         // display details
		
	}
}


