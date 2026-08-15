//PRACTICAL 2
//Importing java utility class
import java.util.*;
public class P2MenuDrivenSeries {
	//main method
    public static void main(String[] args) {
    		//Creating new scanner object
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: "+'\n'+"1. (1, 2, 4, 7, 11...)"+'\n'+"2. (1, 4, 9, 16...)"+'\n'+"3. (0, 7, 26, 63, 124...)");
            //Taking input from the user
            int choice = sc.nextInt();
            
            //Switch case(menu driven)
            switch(choice) {
            	//case 
                case 1: {
                	//SERIES 1
                    int a = 1;
                    for(int i =0; i<=15; i++) {
                        a+=i;
                        System.out.print(a+" ");
                    }
                    //Using break to terminate
                    break;
                }
                case 2: {
                	//SERIES 2
                    int num = 0;
                    for(int i=1; i<=15;i++) {
                        num = i*i;
                        System.out.print(num+" ");
                    }
                    break;
                }
                case 3: {
                	//SERIES 3
                    int num = 0;
                    for(int i=1; i<=15; i++) {
                        num =(i*i*i)-1;
                        System.out.print(num+" ");
                    }
                    break;
                }
                //using default case to print output if there is an wrong input
                default: {
                    System.out.println("Invalid input");
                }
            }
    }
}