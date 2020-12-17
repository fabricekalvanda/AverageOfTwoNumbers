//Fabrice Kalvanda
//Add two numbers from user input, show sum, return the average value
/////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class AverageNums extends Object
{
	public float Average(float num1, float num2) 
   {
		float avg = 0;
      float sum = 0;
      
      sum = num1 + num2;
      System.out.println("The sum of the two numbers is: " + sum + "\n");

      avg = sum / 2;
      return avg;
   }


 	public static void main(String[] args)
 	{
      AverageNums an = new AverageNums();
      
    	Scanner keyboard = new Scanner(System.in);
      float firstNumber = 0;
      float secondNumber = 0;
      
      System.out.println("You will be entering two numbers you'd like to average.\n");
      
      System.out.println("Enter the first number, followed by the Enter Key:");
		if( keyboard.hasNextFloat())
		{
			firstNumber = keyboard.nextFloat();   
		}
		else
		{
   	    System.out.println ("You did NOT type in a number!");
		}
      
		System.out.println("Enter the second number, followed by the Enter Key:");
      if( keyboard.hasNextFloat() )
		{
			 secondNumber = keyboard.nextFloat();   
 
		}
		else
		{
   	    System.out.println ("You did NOT type in a number!");
		}  
	 	
      float total = 0; 
	 	
      total = an.Average(firstNumber, secondNumber); // two values passed to Average method, sum is shown, average is returned
	     
	 	System.out.println("Here is the average of the two numbers: " + total); // average is displayed
   }
}



//Fabrice Kalvanda