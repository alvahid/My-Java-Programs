//PRACTICAL 8
//a java program to delete and element from an array
import java.util.*;
//Importing java utility class
public class P8DeletingArray {
	//main
    public static void main(String[] args) {
    	//Creating new scanner object
        Scanner sc = new Scanner(System.in);
        
        boolean bool1 = true;
        //taking input
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int Array[] = new int[n];
        System.out.println("Enter values in array: ");
        for(int i =0; i<Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be deleted: ");
        int ele = sc.nextInt();
        //for loop for deleting element
        for(int i = 0; i<Array.length;i++) {
        	//checking condition
            if(Array[i] == ele) {
                for(int j = i; j<Array.length-1;j++){
                    Array[j] = Array[j+1];
                }
            }
        }
        //final output
        System.out.println("New Array");
        for(int i = 0; i<Array.length-1;i++) {
            System.out.print(Array[i]+"  ");
        }
    }
}
