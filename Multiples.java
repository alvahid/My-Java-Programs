/* A Java Program to generate first n multiples of a number
taking the number and the limit n from the user*/

//Importing java utility class
import java.util.*;
//Creating new public class
public class Multiples {

	//Main method
	public static void main(String[] args) {
		//Creating new Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Initializing variables
		int n, num, res=0;
		
		System.out.print("Enter a number: ");
		//Taking input from the user 
		num = sc.nextInt();
		
		System.out.print("Enter a limit for the mutliples: ");
		n = sc.nextInt();
		
		//Nested for loop
		for(int i=1; i<=n; i++) {
			int num1 = num;
			for(int j =1; j<=n; j++) {
				res = num1*j;
			}
		}
		
		//Printing final output
		System.out.println("Result: "+res);
		
		//Closing Scanner object
		sc.close();
	}
}
