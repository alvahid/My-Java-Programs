import java.util.*; //Importing java utility package
public class Factorial { //Creating class
    public static void main(String[] args) { //Main method
        Scanner sc = new Scanner(System.in); //Creating a scanner object
        int fact=1; //Initializing variable

        System.out.print("Enter a Number: "); //Printing statement
        int num = sc.nextInt(); //Taking input from the user

        for(int i=num; i>=1; i--) { //For loop
            fact = fact * i;
        }
        System.out.println("Factorial of " +num+ " is " +fact);

        sc.close(); //Closing scanner object
    }
}

/*
   Variable  |  Datatype  |                              Description                                 |
   fact      |   Int      | Takes input from the user, arithmetical operation                        |
   num       |   Int      | Takes input from the user               |
     i       |   Int      | Used in for loop                                                         |
*/

