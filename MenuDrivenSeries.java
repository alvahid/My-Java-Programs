//PROGRAM 2
import java.util.*;
public class MenuDrivenSeries {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: "+'\n'+"1. (1, 2, 4, 7, 11...)"+'\n'+"2. (1, 4, 9, 16...)"+'\n'+"3. (0, 7, 26, 63, 124...)");
            int choice = sc.nextInt();

            switch(choice) {
                case 1: {
                    int a = 1;
                    for(int i =0; i<=15; i++) {
                        a+=i;
                        System.out.print(a+" ");
                    }
                    break;
                }
                case 2: {
                    int num = 0;
                    for(int i=1; i<=15;i++) {
                        num = i*i;
                        System.out.print(num+" ");
                    }
                    break;
                }
                case 3: {
                    int num = 0;
                    for(int i=1; i<=15; i++) {
                        num =(i*i*i)-1;
                        System.out.print(num+" ");
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                }
            }
    }
}
