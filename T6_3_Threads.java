package dailyTasks;

public class T6_3_Threads 
{
public static void main(String[] args) 
	{
		Runnable task1 = ()->
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(Thread.currentThread().getName() + ":" + i);
				try
				{
					Thread.sleep(500);
				}
					catch(InterruptedException e)
					{
						System.out.println(e);
					}
			}
		};
		Runnable task2= ()->
		{
			for(int i=1; i<=5; i++)
				{
					System.out.println(Thread.currentThread().getName() + ":" + i);
					try
					{
						Thread.sleep(700);
					}
					catch(InterruptedException e)
					{
						System.out.println(e);
					}
				}
		  };
		Runnable task3 = ()->
		{
			for(int i=1; i<=5; i++)
				{
					System.out.println(Thread.currentThread().getName() + ":" + i);
					try
					{
						Thread.sleep(500);
					}
					catch(InterruptedException e)
					{
						System.out.println(e);
					}
				}
			};
		
					Thread t1 = new Thread(task1, "Thread-1");
					Thread t2 = new Thread(task2, "Thread-2");
				    Thread t3 = new Thread(task3, "Thread-3");

		             t1.start();
			         t2.start();
				     t3.start();

				try
				{
				t1.join();
	            t2.join();
			    t3.join();
				}
				catch (InterruptedException e)
			    {
				 System.out.println(e);
				}
                  System.out.println("All threads completed");
				}
			}
