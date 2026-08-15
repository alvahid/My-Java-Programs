//PRACTICAL 15
import java.util.*;
public class Pr15PrefixSuffix {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String input[] = new String[10];
		
		//Taking input
		System.out.println("Enter 10 words: ");
		for(int i =0; i < 10;i++) {
			input[i] = sc.nextLine();
		}
		System.out.println("Enter a prefix and a suffix respectively");
		String prefix = sc.next();
		String suffix = sc.next();
		
		//Conditions for checking the prefix
		System.out.println("The strings that start with the prefix "+prefix+" are: ");
		for(int i=0; i<10; i++) {
			//Checking the prefix with startsWith() method
			boolean check = input[i].startsWith(prefix);
			if(check==true) {
				System.out.println(input[i]);
			}
			
		}
		//Conditions for checking the suffix
		System.out.println("The strings that ends with the suffix "+suffix+" string are: ");
		for(int i=0; i<10; i++) {
			//Checking the suffix with endsWith() method
			boolean check = input[i].endsWith(suffix);
			if(check==true) {
				System.out.println(input[i]);
			}
			
		}
	}
}
