import java.util.*;
public class InstertingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		System.out.println("Enter values for array");
		for(int i =0; i<array.length-1; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the position to insert the element");
		int position = sc.nextInt();
		
		System.out.println("Enter the element to insert");
		int element = sc.nextInt();
		
		for(int i = array.length-1; i>=position; i--) {
			array[i]=array[i-1];		
		}
		array[position] = element;
		System.out.println("New array");
		for(int i =0;i<array.length; i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}
} 
