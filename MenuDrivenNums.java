import java.util.*; //Importing java utility package
public class MenuDrivenNums { //Creating class
    public static void main(String[] args) { //Main method
        Scanner sc = new Scanner(System.in); //Creating a scanner object
        int num,psum=0,nsum=0,choice; //Initializing variables

        System.out.println("Enter numbers and enter 0 to terminate input: "); //Printing statement

        for(int i = 1; ; i++) { //For loop
            num = sc.nextInt(); //Taking input from the user
            if (num==0) { //If (a conditional statement)
                break; //Break to terminate if the condition is true
            }
            else if (num>0 && num%2==0) { //Else-if (a conditional statement)
                psum+= num;
            }
            else if (num<0) {
                nsum+= num;
            }
        }
        System.out.println("Enter 1 to print the sum of negative numbers: ");
        System.out.println("Enter 2 to print the sum of positive even numbers: ");
        choice=sc.nextInt();

        switch(choice) { //Switch case
            case 1: {
                System.out.println("Sum of negative numbers: "+nsum);
                break;
            }
            case 2: {
                System.out.println("Sum of positive even numbers: "+psum);
                break;
            }
            default: { //Default case if the case entered is wrong
                System.out.println("Invalid input");
            }
        }
        sc.close(); //Closing scanner object
    }
}

/*
   Variable  |  Datatype  |                              Description                                 |
   num       |   Int      | Takes input from the user, arithmetical operation                        |
   psum      |   Int      | Arithmetical operations                                                  |
   nsum      |   Int      | Arithmetical operations                                                  |
   choice    |   Int      | Takes input from the user and further used in switch case                |
     i       |   Int      | Used in for loop                                                         |
*/
