import java.util.*;
public class TenNums {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int array1[] = new int [10];
		int array2[] = new int [10];
		int sumarray[] = new int [10];
		System.out.println("Enter 10 numbers for array 1: ");
		for(int i=0;i<10;i++){
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter 10 numbers for array 2: ");
		for(int i=0;i<10;i++){
			array2[i] = sc.nextInt();
		}
		for(int i=0; i<10;i++) {
			sumarray[i]=array1[i] + array2[i];
		}
		System.out.println("output for index 0 to 9");
		for(int i=0; i<10;i++) {
			System.out.println(sumarray[i]);
		}
		sc.close();
	}
}
