package dailyTasks;

public class T2_2_CMarks 
{                                                          // class name = file name
    private String name;
    private int rollNumber;

    // Constructor
    public T2_2_CMarks(String name, int rollNumber)
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Getter methods
    public String getName() 
    { 
    	return name; 
    }
    public int getRollNumber() 
    { 
    	return rollNumber;
    }

    // Method Overloading
    public int calculateMarks(int subject1, int subject2) 
    {
        return subject1 + subject2;
    }

    public int calculateMarks(int subject1, int subject2, int subject3)
    {
        return subject1 + subject2 + subject3;
    }

    public double calculateMarks(double total) 
    {
        return total;
    }

    // Display student details
    public void displayStudentDetails() 
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    // Main method
    public static void main(String[] args)
    {
        T2_2_CMarks s1 = new T2_2_CMarks("Abisheik", 101);

        // Display student details
        s1.displayStudentDetails();

        // Calculate totals
        int total2 = s1.calculateMarks(80, 90);
        int total3 = s1.calculateMarks(75, 85, 95);
        double totalDirect = s1.calculateMarks(270.5);

        // Print totals
        System.out.println("Total (2 subjects): " + total2);
        System.out.println("Total (3 subjects): " + total3);
        System.out.println("Total (direct double): " + totalDirect);
    }
}
