import java.util.*;
public class  Pr19CharClassMethods {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = sc.nextLine();
		
		char ch;
		char newLet = '0';
		String newStr=" ";
		System.out.println("Uppercase converted to lowercase and vice versa: ");
		//Counter variables
		int lowerCount=0, upperCount=0,digitCount=0, specialCount=0, spaceCount=0,addDigit=0;
		int stringInt = 0;
		//Using for loop to extract a character and perform operations on it
		for(int i=0;i<input.length(); i++) {
			ch = input.charAt(i);
			
			//Using conditional statements
			if(Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				upperCount++;
			}
			else if(Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
				lowerCount++;
			}
			else if(Character.isDigit(ch)) {
				digitCount++;
				String intStr = Character.toString(ch);
				stringInt = Integer.parseInt(intStr);
				addDigit+=stringInt;
			}
			else if(ch==' ') {
				spaceCount++;
			}
			else {
				specialCount++;
			}
			//Assigning value to the converted new string
			newLet = ch;
			newStr+= Character.toString(newLet);
		}
		//Printing final output
		System.out.println("Counter values\nUppercase letters: "+upperCount+"\nLowercase letters: "+lowerCount+"\nDigit count: "+digitCount+"\nSpecial character count: "+specialCount+"\nWhite space count: "+spaceCount);
		System.out.println("Converted String: "+newStr);
		System.out.println("Added value of the digits: "+addDigit);
	}
}
