//Isaac Hartzell
// February 18, 2017 Last Modified February 23, 2017
// This calculator demonstrates class usage.

import java.util.Scanner;

public class CalculatorWithClasses
{

	public static void main(String[] args) 
	{
		int numberChoice = 0;
		double operand2 = 0;	
		
		BluePrintCalculator primaryProgramObj = new BluePrintCalculator();	// primaryProgramObj variable is the new object 		
		do																	// created from BluePrintCalculator
		{
			System.out.println("The current value is " + primaryProgramObj.getCurrentValue() + "\n");
			numberChoice = primaryProgramObj.displayMenu();
				
			if (numberChoice == 1)
			{
				primaryProgramObj.add(operand2);
			}
				
			else if (numberChoice == 2)
			{
				primaryProgramObj.subtract(operand2);
			}
				
			else if (numberChoice == 3)
			{
				primaryProgramObj.multiply(operand2);
			}
				
			else if (numberChoice == 4)
			{
				primaryProgramObj.divide(operand2);
			}
				
			else if (numberChoice == 5)
			{
				primaryProgramObj.clear();
			}
				
			else if (numberChoice == 6)	// Exit
			{
				System.out.println("Goodbye! Thank you for using Isaac's calculator.");	
			}
				
		}while(numberChoice >=1 && numberChoice <= 5);

	}

}

