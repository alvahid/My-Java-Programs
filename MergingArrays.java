import java.util.*;
public class MergingArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array1[] = new int[4];
		int array2[] = new int[6];
		int array3[] = new int[10];
		
		System.out.println("Enter 4 numbers for array 1");
		for(int i=0; i<array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter 6 numbers for array 2");
		for(int i=0; i<array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		
		System.out.println("Merging 2 arrays:");
		for(int i=0; i<array1.length; i++) {
			array3[i] = array1[i];
		}
		for(int i=4; i<array3.length; i++) {
			array3[i] = array2[i-4];
		}
		System.out.println("Values of array 3:");
		for(int i=0; i<10; i++) {
			System.out.println(array3[i]);
		}
		sc.close();
	}
}
