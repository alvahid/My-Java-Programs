//PRACTICAL 4
/*A java program to calculate and print the sum of odd, even numbers n is to be entered 
 * by the user*/
import java.util.*; //Importing java utility package
public class OddNEvenNums { //Creating public class
	public static void main(String[]args) {
		//Creating new scanner object
		Scanner scan = new Scanner(System.in);
		
		//Initializing variables 
		int n, osum=0, esum=0;
		
		System.out.print("Enter a number: ");
		//Taking input from the user
		n = scan.nextInt();
		
		//For loop
		for (int i = 1; i<=n; i++) {
			//If-else a conditional statement
			if(i%2==0) {
				esum+=i;
			}
			else {
				osum+=i;
			}
		}
		
		//Printing the final result
		System.out.println("Sum of even numbers: "+esum+'\n'+"Sum of odd numbers: "+osum);
		
		//Closing the Scanner object
		scan.close();
	}
}
