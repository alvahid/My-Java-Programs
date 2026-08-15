//PROGRAM 1
import java.util.*;
public class MenuDrivenArrrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the array: ");
        int n = sc.nextInt();
        int array[] = new int[n];

        System.out.println("Enter values in array: ");
        for(int i=0; i< array.length; i++) {
            array [i] =sc.nextInt();
        }
        System.out.println("Enter your choice:"+'\n'+"1: To calculate the sum of numbers present in odd positions and even positions respectively"+'\n'+"2: To find the biggest and the smallest number in array");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                int osum = 0, esum = 0;
                for (int i = 0; i< array.length; i++) {
                    if(i%2==0) {
                        esum+=array[i];
                    }
                    else {
                        osum+=array[i];
                    }
                }
                System.out.println("Sum of odd numbers in array: "+osum+'\n'+"Sum of even numbers in array: "+esum);
                break;
            }
            case 2: {
                int largest = array[0], smallest = array[0];
                for(int i=0;i<array.length;i++) {
                    if(largest<=array[i]){
                        largest = array[i];
                    }
                    if(smallest>=array[i]){
                        smallest = array[i];
                    }
                }
                System.out.println("Smallest number in the array: "+smallest+'\n'+"Largest number in the array: "+largest);
                break;
            }
            default:
                System.out.println("invalid input");
        }
    }
}
