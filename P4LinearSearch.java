//PRACTICAL 4
import java.util.*;
public class P4LinearSearch {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		boolean bool = true;
		//Entering values in array
		System.out.println("Enter 10 numbers: ");
		for(int i=0; i<10; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("Enter a number from the entered numbers to search for indexing");
		int indexing = sc.nextInt();
		//Checking for the elements
		for(int i=0; i<10; i++) {
			//Condition check (finding value)
			if(array[i]==indexing) {
				System.out.println("The number is "+array[i]+" at index "+i);
				bool = true;
				break;
			}
			//if value not found bool will be false
			else {
				bool = false;
			}
		}
		if (bool==false) {
			System.out.println("-1");
		}
		sc.close();
	}
}
