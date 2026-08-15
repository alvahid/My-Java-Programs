/* A Java program to find if a person is eligible to vote in India or not. A person can vote only if
he/she is a citizen of India and is of age greater than 18 years.*/

//Importing java utility class
import java.util.*;
//Creating new public class
public class VotingEligiblity {

	//Main method
	public static void main(String[] args) {
		//Creating new Scanner object
		Scanner in = new Scanner(System.in);
		
		//Initializing variables
		boolean input;
		int age;
		
		System.out.print("Are you the citizen of India(true or false): ");
		//Taking input from the user
		input = in.nextBoolean();
		
		//If, else a conditional statement
		if(input==true) {
			
			System.out.print("Enter your age: ");
			age = in.nextInt();
			
			if(age>=18) {
			System.out.println("You are eligible for voting");
			}
		}
		else {
			System.out.println("You are not eligible for voting");
		}
		
		//Closing Scanner object
		in.close();
	}
}
