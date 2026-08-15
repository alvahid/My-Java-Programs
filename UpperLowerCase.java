//PRACTICAL 1
/*A java program to change upper case character to lower case and vice versa*/
import java.util.*; //Importing java utility package
public class UpperLowerCase { //Creating public class
	public static void main(String[] args) { //Main method
		//Creating new Scanner object
		Scanner sc = new Scanner(System.in); 
		
		//Initializing variables
		char input, ch;
		int ascii;
		
		System.out.print("Enter a character: ");
		//Taking input from the user
		input = sc.next().charAt(0);
		
		ascii=input;
		//If-else a conditional statement
		if(ascii>=65 && ascii<=90) {
			ascii+=32;
			ch=(char)ascii;
		}
		else {
			ascii-=32;
			ch=(char)ascii;
		}
		
		//Printing final output
		System.out.println("Output: "+ch); 
		
		//Closing scanner object
		sc.close();
	}
}
