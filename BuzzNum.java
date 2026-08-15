//PRACTICLE 2
/*A java program to find if the number entered is a buzz number or not*/
import java.util.*; //Importing java utility package
public class BuzzNum { //Creating public class
	public static void main(String[] args) { //Main method
		//Creating new scanner object
		Scanner scan = new Scanner(System.in);
		
		//Initializing variable
		int num;
		
		System.out.print("Enter a number: ");
		//Taking input from the user
		num = scan.nextInt();
		
		//If-else a conditional statement
		if(num%7==0 || num%10==7) {
			System.out.println(num+" is a Buzz number");
		}
		else {
			System.out.println(num+" is not a Buzz number");
		}
		
		//Closing scanner object
		scan.close();
	}
}
