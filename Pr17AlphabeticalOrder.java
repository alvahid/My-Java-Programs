import java.util.Scanner;
public class Pr17AlphabeticalOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[10];
		System.out.println("Enter 10 words: ");
		//Taking input in an array using for loop
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.next();
		}
		String temp="";
		//Using Bubble sort technique to sort and arrange in alphabetical order
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1; j++) {
				//Swap if condition true
				if(arr[j].compareToIgnoreCase(arr[j+1])<0) {
					//temp to store a variable temporarily
					temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("alphabetical order: ");
		//Printing final output
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
}
