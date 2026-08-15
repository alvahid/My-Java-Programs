//PRACTICAL 16
import java.util.*;
public class Pr16PigLatin {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Enter a Word: ");
		String input = sc.next();
		//Converting input to upper case
		String inputUcase = input.toUpperCase();
		
		int len = input.length(),counter = 0;
		char ch = '0';
		int i =0;
		System.out.println("The pig latin for the given word: ");
		//Searching for a vowel using for loop
		for(i=0; i<input.length(); i++) {
			ch = inputUcase.charAt(i);
			if(ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I') {
				//Using brake; if a vowel is found
				counter++;
				break;
			}
		}
		len-=len;
		//Checking condition for word starting with vowel
		if(i==len) {
			System.out.println(inputUcase);
			System.exit(0);
		}
		//Condition for a word with no vowel
		if(counter>0) {
			//Using substring() method 
			String temp1 = inputUcase.substring(i,input.length());
			String temp2 = inputUcase.substring(0,i);
		
		System.out.println(temp1+temp2+"AY");
		}
		else{
			System.out.println(inputUcase);
		}
	}
}
