//PRACTICAL 7
import java.util.*;
public class P7SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int smallest = 0, temp=0;
		//taking size of the array from the user
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int array[] = new int[n];

		System.out.println("Enter values in array: ");
		//Taking values of the element
		for(int i = 0; i< array.length; i++) {
			array[i] = sc.nextInt();
		}
		//Selection sort
		for(int i =0; i<array.length-1;i++) {
			smallest =i;
			for(int j=i+1; j< array.length; j++) {
				//checking condition
				if (array[smallest]>array[j]) {
					smallest = j;
				}
			}
			//swap
			temp =array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
		//Printing final output
		System.out.println("Ascending order");
		for(int i=0;i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
