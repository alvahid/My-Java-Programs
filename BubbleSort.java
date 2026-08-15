//PROGRAM 6
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        //Taking values in array
        System.out.println("Enter the values in the array: ");
        for (int i = 0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
        int count = array.length;
        int temp =0;
        //bubble sort
        for (int i =0; i< array.length-1; i++) {
            for (int j =0; j<array.length-i-1;j++) {
                if(array[j] > array[j+1]) {
                    //swap if condition is true
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        //printing new array
        System.out.println("New array: ");
        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
