package dailyTasks;

public class T6_1_MultipleThread  extends Thread
{
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			System.out.println("Multi Thread");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args)
	{
		T6_1_MultipleThread  t1 = new T6_1_MultipleThread ();
		T6_1_MultipleThread  t2 = new T6_1_MultipleThread ();
		T6_1_MultipleThread  t3 = new T6_1_MultipleThread ();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
