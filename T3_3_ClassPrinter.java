package dailyTasks;

class Printer
{
                                                       // print integer
    public void print(int value) 
    {
        System.out.println("print integer: " + value);
    }

                                                       // print string
    public void print(String value) 
    {
        System.out.println("print string: " + value);
    }

                                                       // print double
    public void print(double value)
    {
        System.out.println("print double: " + value);
    }
}

public class T3_3_ClassPrinter
{
    public static void main(String args[])
    {
        Printer p = new Printer();

        p.print(100);           
        p.print("Hello Java"); 
        p.print(99.99);        
    }
}
