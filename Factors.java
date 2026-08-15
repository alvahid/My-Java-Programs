import java.util.*; //Importing java utility package
public class Factors { //Creating class
    public static void main(String[] args) { //Main method
        Scanner sc = new Scanner(System.in); //Creating a scanner object
        int fact=0; //Initializing variable

        System.out.print("Enter a number: "); //Printing statement
        fact = sc.nextInt(); //Taking input from the user

        System.out.print("Factors: ");

        for (int i=1; i<fact; ++i) { //For loop
            if (fact%i == 0) {
                System.out.print(i+" "); //If (a conditional statement)
            }
        }
        sc.close(); //Closing scanner object
    }
}

/*
   Variable  |  Datatype  |                              Description                                 |
   fact      |   Int      | Takes input from the user, arithmetical operation                        |
     i       |   Int      | Used in for loop                                                         |
*/
