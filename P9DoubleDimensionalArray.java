//PRACTICAL 9
//importing java utility class
import java.util.*;
//new class
public class P9DoubleDimensionalArray {
	//main
    public static void main(String[] args) {
    	//new scanner object
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[4][4];
        //taking input
        System.out.println("Enter the values in the array of 4x4 size: ");
        for (int i=0;i<4;i++) {
            for (int j=0; j<4;j++) {
                array[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
        //for loop
        for(int i =0; i<4;i++ ) {
            for (int j =0; j<4;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
            //sum of rows
        }
        System.out.println('\n'+"Sum of rows: ");
        int count =1, add=0;
        for(int i =0; i<4; i++) {
            System.out.print("Sum of the elements of row "+count+": ");
            ++count;
            add =0;
            for (int j =0;j<4;j++) {
                add+=array[i][j];
            }
            System.out.println(add);
        }
        count = 1;
        //sum of column
        int sumcol = 0;
        System.out.println('\n'+"Sum of columns:");
        for (int i =0; i<4; i++) {
            sumcol = 0;
            System.out.print("Sum of the elements of column "+count+": ");
            ++count;
            for (int j=0; j<4; j++) {
                sumcol+=array[j][i];
            }
            System.out.println(sumcol);
        }
        count = 1;
        //sum diagonally 
        System.out.print('\n'+"Sum of the elements diagonally(left to right): ");
        int sum=0;
        for(int i =0;i<4; i++) {
            for(int j=0; j<4; j++) {
                if(i==j) {
                    sum+=array[i][j];
                }
            }
        }
        System.out.println(sum);
        
        System.out.print('\n'+"Sum of the elements diagonally(right to left): ");
        int sum1 = 0;
        for(int i = 0; i<4;i++) {
        	for (int j =0;j<4;j++) {
        		if(i==0 && j==3 || i==1 && j==2 || i==2&&j==1 || i==3 && j==0) {
        			sum1+=array[i][j];
        		}
        	}
        }
        System.out.println(sum1);
    }
}