//PROGRAM 5
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[10];
        int first = 0, last = array1.length-1;
        int mid = (first+last)/2;
        boolean bool1 = false;

        System.out.println("Enter values for array in ascending order:");
        for (int i=0; i< array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        //Taking the value for searching
        System.out.println("Enter the value to search for");
        int value = sc.nextInt();
        //using while loop to find element
        while(first<=last) {
            //condition check if array1 at index mid = value
            if(array1[mid]==value) {
                System.out.println("Value found at index "+mid);
                bool1=true;
                break;
            }
            //condition check if array1 at index mid > value
            if(array1[mid]>value) {
                last = mid - 1;
            }
            else if (array1[mid]<value) {
                first = mid +1;
            }
            //value updation
            mid = (first+last)/2;
        }
        //returning -1 to the user if condition is false
        if(bool1==false) {
            System.out.println("-1");
        }
        sc.close();
    }
}
