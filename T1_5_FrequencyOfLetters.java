package dailyTasks;

public class T1_5_FrequencyOfLetters 
{
public static void main(String[] args) 
	{
		String word = "apple";

        int countA = 0;
        int countP = 0;
        int countL = 0;
        int countE = 0;

  
        if (word.charAt(0) == 'a') 
        	countA++;
        if (word.charAt(0) == 'p') 
        	countP++;
        if (word.charAt(0) == 'l') 
        	countL++;
        if (word.charAt(0) == 'e') 
        	countE++;

        if (word.charAt(1) == 'a')
        	countA++;
        if (word.charAt(1) == 'p') 
        	countP++;
        if (word.charAt(1) == 'l')
        	countL++;
        if (word.charAt(1) == 'e')
        	countE++;

        
        if (word.charAt(2) == 'a') 
        	countA++;
        if (word.charAt(2) == 'p')
        	countP++;
        if (word.charAt(2) == 'l')
        	countL++;
        if (word.charAt(2) == 'e')
        	countE++;

        if (word.charAt(3) == 'a')
        	countA++;
        if (word.charAt(3) == 'p')
        	countP++;
        if (word.charAt(3) == 'l')
        	countL++;
        if (word.charAt(3) == 'e')
        	countE++;

        if (word.charAt(4) == 'a') 
        	countA++;
        if (word.charAt(4) == 'p') 
        	countP++;
        if (word.charAt(4) == 'l')
        	countL++;
        if (word.charAt(4) == 'e')
        	countE++;

       
        System.out.println("Frequency of letters in " + word + ":");
        System.out.println("a: " + countA);
        System.out.println("p: " + countP);
        System.out.println("l: " + countL);
        System.out.println("e: " + countE);

	}

}
