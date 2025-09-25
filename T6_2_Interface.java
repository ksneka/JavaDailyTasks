package dailyTasks;

public class T6_2_Interface implements Runnable
{
	@Override
	public void run()
	{
		for(int i=20; i>=1; i--)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
            try 
            {
                Thread.sleep(1000); 
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }

	public static void main(String[] args) 
	{
		T6_2_Interface task = new T6_2_Interface();
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		
		t1.start();
		t2.start();

	}

}
