package dailyTasks;

import java.util.Scanner;

public class T1_1_ElseIf
{

	public static void main(String[] args)
	{
		   Scanner sc= new Scanner (System.in);
			
			System.out.print("Enter  first number- ");
			 int a=sc.nextInt();
			 
			 System.out.print("Enter second number -");
			 int b=sc.nextInt();
			 
			 System.out.println("Enter third number -");
			 int c=sc.nextInt();
			 
			 int total=a+b+c;
			 System.out.println("Total =" + total);
			 
			 if( total<=10)
			 {
				 System.out.println("the number is lesser than 10");
				 
			 }
			 else if(total > 10 &&  total <=20)
			 {
				 System.out.println("the number is greater than 10");
			 }
			 else if(total > 20 &&  total <=30)
			 {
				 System.out.println("the number is greater than 10");
				 System.out.println("the number is greater than 20");
			 }
			 else if(total > 30 &&  total <=40)
			 {
				 System.out.println("the number is greater than 10");
				 System.out.println("the number is greater than 20");
				 System.out.println("the number is greater than 30");
			 }
			 else if(total > 40 &&  total <=50)
			 {
				 System.out.println("the number is greater than 10");
				 System.out.println("the number is greater than 20");
				 System.out.println("the number is greater than 30");
				 System.out.println("the number is greater than 40");
			 }
			 else if(total > 50 &&  total <=60)
			 {
				 System.out.println("the number is greater than 10");
				 System.out.println("the number is greater than 20");
				 System.out.println("the number is greater than 30");
				 System.out.println("the number is greater than 40");
				 System.out.println("the number is greater than 50");
			 }
			 else if(total > 60 &&  total <=70)
			 {
				 System.out.println("the number is greater than 10");
				 System.out.println("the number is greater than 20");
				 System.out.println("the number is greater than 30");
				 System.out.println("the number is greater than 40");
				 System.out.println("the number is greater than 50");
				 System.out.println("the number is greater than 60");
			 }
			 
			 else if(total > 70 &&  total <=80)
			 {
				 System.out.println("the number is greater than 10");
				 System.out.println("the number is greater than 20");
				 System.out.println("the number is greater than 30");
				 System.out.println("the number is greater than 40");
				 System.out.println("the number is greater than 50");
				 System.out.println("the number is greater than 60");
				 System.out.println("the number is greater than 70");
			 }
			 else if(total > 80 &&  total <=90)
			 {
				 System.out.println("the number is greater than 10");
				 System.out.println("the number is greater than 20");
				 System.out.println("the number is greater than 30");
				 System.out.println("the number is greater than 40");
				 System.out.println("the number is greater than 50");
				 System.out.println("the number is greater than 60");
				 System.out.println("the number is greater than 70");
				 System.out.println("the number is greater than 80");
			 }
			 else if(total > 90 &&  total <=100)
			 {
				 System.out.println("the number is greater than 10");
				 System.out.println("the number is greater than 20");
				 System.out.println("the number is greater than 30");
				 System.out.println("the number is greater than 40");
				 System.out.println("the number is greater than 50");
				 System.out.println("the number is greater than 60");
				 System.out.println("the number is greater than 70");
				 System.out.println("the number is greater than 80");
				 System.out.println("the number is greater than 90");
			 }
			 else
			 {
				 System.out.println("the number is greater than 100");
			 }
	}

}
