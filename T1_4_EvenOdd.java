package dailyTasks;

public class T1_4_EvenOdd
{

	public static void main(String[] args) 
	{
		int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 100; i++) 
        {
            if (i % 2 == 0)
            {
                evenSum += i; 
            }
            else 
            {
                oddSum += i; 
            }
        }
        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);

	}

}
 