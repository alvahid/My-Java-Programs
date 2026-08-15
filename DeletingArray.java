//PROGRAM 8
import java.util.*;
public class DeletingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool1 = true;
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int Array[] = new int[n];
        System.out.println("Enter values in array: ");
        for(int i =0; i<Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be deleted: ");
        int ele = sc.nextInt();
        for(int i = 0; i<Array.length;i++) {
            if(Array[i] == ele) {
                for(int j = i; j<Array.length-1;j++){
                    Array[j] = Array[j+1];
                }
            }
        }
        System.out.println("New Array");
        for(int i = 0; i<Array.length-1;i++) {
            System.out.println(Array[i]+"  ");
        }
    }
}
