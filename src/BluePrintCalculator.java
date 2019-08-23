import java.util.Scanner;
public class BluePrintCalculator // My blue print model for the calculator for the real program.
{
	BluePrintCalculator()	// Constructor, It essentially constructs objects for the class.
	{
		currentValue = 0.0;	
	}
	
	private double currentValue; // Field Variable Private to this class.
	
	public static int displayMenu()
	{
		
		Scanner input = new Scanner(System.in);
		int numberChoice;
		System.out.println("Menu");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Clear ");
		System.out.println("6. Quit \n");
		System.out.print("What would you like to do? Pick a number 1-6:");
		numberChoice = input.nextInt();
		
		while (numberChoice < 1 || numberChoice > 6)
		{
			System.out.println("I'm sorry," + numberChoice + " wasn't one of the options.\n");
			System.out.println("Menu");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Clear ");
			System.out.println("6. Quit \n");
			System.out.print("What would you like to do? Pick a number 1-6:");
			numberChoice = input.nextInt();
		}
			
		return numberChoice;
	}
	
	public static double getOperand(String prompt)	// Function prints out prompts,
	{
		Scanner input = new Scanner(System.in);
		
		double operand;
		
		System.out.print(prompt );
		operand = input.nextDouble();				
		
		return operand;
	}
	
	public double getCurrentValue()
	{
		
		return currentValue;
	}
	
	public void add(double operand2)
	{
		operand2 = getOperand("What is the second number?");
		currentValue += operand2;	
	}
	
	public void subtract(double operand2)
	{
		operand2 = getOperand("What is the second number?");
		currentValue -= operand2;	
	}
	
	public void multiply(double operand2)
	{
		operand2 = getOperand("What is the second number?");
		currentValue *= operand2;	
	}
	
	public void divide(double operand2)
	{
		operand2 = getOperand("What is the second number?");
		currentValue /= operand2;
		
		if (operand2 == 0.0)
		{
			 currentValue = Double.NaN;
		}
	}
	
	public void clear()
	{
		currentValue = 0.0;
	}
}
