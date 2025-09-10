package dailyTasks;

public class T2_1_Student
{
    private String name;
    private int rollnumber;
    private int marks;
            
                                                       // Getters - used to read the values of private variables
    public String getName() 
    {
        return name;
    }

    public int getRollNumber()
    {
        return rollnumber;
    }

    public int getMarks() 
    {
        return marks;
    }
     
                                                          // Setters - used to update/change the values of private variables
    public void setName(String newName) 
    {
        this.name = newName;
    }

    public void setRollNumber(int newRollNumber)
    {
        this.rollnumber = newRollNumber;
    }

    public void setMarks(int newMarks)
    {
        this.marks = newMarks;
    }
	 
    
    public static void main(String[] args)                 // create obj

    {
        T2_1_Student obj = new T2_1_Student();         
		
        obj.setName("Abisheik");                           //  using setter to set value
        obj.setRollNumber(101);
        obj.setMarks(95);
        
	        
        System.out.println("Name: " + obj.getName());
        System.out.println("Roll Number: " + obj.getRollNumber());     // get values
        System.out.println("Marks: " + obj.getMarks());
    }
}
