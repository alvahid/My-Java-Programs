//PRACTICAL 6
/*A java program to check whether the character enter by the user is Letter or Digit or a
 * Special character */
import java.util.*; //Importing java utility package
public class LetterDigitSpecial { //Creating public class
	public static void main(String[] args) { //Main method
		//Creating new Scanner method
		Scanner scan = new Scanner(System.in);
		
		//Initializing variables
		char ch;
		int ascii; 
		
		System.out.print("Enter a character: ");
		//Taking input from the user
		ch = scan.next().charAt(0);
		
		ascii = ch;
		
		//If, else-if, else a conditional statement 
		if(ascii>=48 && ascii<=57) {
			System.out.println("It is a number");
		}
		else if(ascii>=65 && ascii<=122) {
			System.out.println("It is a Letter");
		}
		else {
			System.out.println("It is a special character");
		}
		
		//Closing Scanner object
		scan.close();
	}
}
