package dailyTasks;

class Student      //class
{
	String name;   //fields
	int rollno;
	char grade;

Student()            // Default constructor
{
	name="sneka";
	rollno= 1;
	grade='N';
}

Student(String name,int rollno, char grade)  //parameterized constructor
{
	this.name=name;
	this.rollno=rollno;
	this.grade=grade;
}
Student(Student s)                       // copy constructor
{
	this.name=s.name;
	this.rollno=s.rollno;
	this.grade=s.grade;
}
 void displayInfo()                     //method
 {
	 System.out.println("Name:" + name);
	 System.out.println("RollNo:"+ rollno);
	 System.out.println("Grade:" + grade);
 }
}

public class T4_2_Student
{
	public static void main(String args[])
	{ 
		Student s1=new Student();                      //default constructor
		Student s2=new Student("sneka", 101, 'A');     //parameterised constructor
		Student s3=new Student(s2);                    //copy constructor
		
		System.out.println("Student1");                //display details
		s1.displayInfo();
		
		System.out.println("Student2");
		s2.displayInfo();
		
		System.out.println("Student3");
		s3.displayInfo();
		
	
		
	}
}