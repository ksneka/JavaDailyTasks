package dailyTasks;

// Abstract class
abstract class Employee 
{
    public abstract double calculateSalary();

    public void displayRole(String role)
    {
        System.out.println("Role: " + role);
    }
}

// Manager class
class Manager extends Employee 
{
    double salary;
    double bonus;

    Manager(double salary, double bonus) 
    {
        this.salary = salary;
        this.bonus = bonus;
    }
    
    public double calculateSalary() 
    {
        return salary + bonus;
    }
}


public class T3_2_AbstractClassEmployee 
{
    public static void main(String[] args) 
    {
        Employee emp = new Manager(50000, 10000);
        emp.displayRole("Manager");
        System.out.println("Salary = " + emp.calculateSalary());
    }
}
