//PRACTICAL 14
import java.util.*;
public class Pr14PalindromeString {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word to check for palindrome: ");
		String input = sc.next();
		char letter;
		String reversedWord = "";
		//Reversing the order of the word entered by the user and storing it in a variable by using for loop
		for(int i = input.length()-1; i>=0;i--) {
			letter = input.charAt(i);
			reversedWord += letter; 
		}
		//Printing Output
		if(reversedWord.equalsIgnoreCase(input)) {
			System.out.println(input+ " The word is palindrome");
		}
		else {
			System.out.println(input+ " The word is not palindrome");
		}
	}
}
