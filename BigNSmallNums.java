//PRACTICAL 3
/*A java program to find bigger and smaller number entered by the user*/
import java.util.*; //Importing java utility package
public class BigNSmallNums { //Creating public class
	public static void main(String[] args) { //Main method
		//Creating new Scanner object
		Scanner input = new Scanner(System.in);
		
		//Initializing Variables
		int num1, num2, min, max;
		
		System.out.println("Enter numbers: ");
		//Taking input from the user
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		//Using some operations from Math class
		min = Math.min(num1,num2);
		max = Math.max(num1, num2);
		
		//Printing final result
		System.out.println("Smaller number: "+min+'\n'+"Bigger number: "+max);
		
		//Closing scanner object
		input.close();
	}
}
