import java.util.*; //Importing java utility package
public class ElectronicsShop { //Creating class
    public static void main(String[] args) { //Main method
        Scanner sc = new Scanner(System.in); //Creating a scanner object
        String name,address; //Initializing variables
        double purchaseamt,discount,totalamt = 0;
        char choice;

        System.out.print("Enter name of the customer: "); //Printing statement
        name = sc.next(); //Taking input from the user
        System.out.print("Enter the address of the customer: ");
        address = sc.next();
        System.out.print("Enter purchase amount: ");
        purchaseamt = sc.nextFloat();
        System.out.print("Enter the type of purchase(Enter 'L' for laptop and 'D' for desktop pc): ");
        choice = sc.next().charAt(0);

        switch (choice) { //Switch case
            case 'L': {
                if (purchaseamt<=25000) { //If (a conditional statement)
                    totalamt = purchaseamt;
                }
                else if (purchaseamt>25000 && purchaseamt<=50000) { //Else-if (a conditional statement)
                    discount = (purchaseamt*5)/100;
                    totalamt = purchaseamt-discount;
                }
                else if (purchaseamt>50000 && purchaseamt<=100000) {
                    discount = (purchaseamt*7.5)/100;
                    totalamt = purchaseamt-discount;
                }
                else if (purchaseamt>100000) {
                    discount = (purchaseamt*10)/100;
                    totalamt = purchaseamt-discount;
                }
                break;  //Break to terminate the switch case
            }
            case 'D': {
                if (purchaseamt<=25000) {
                    discount = (purchaseamt*5)/100;
                    totalamt = purchaseamt-discount;
                }
                else if (purchaseamt>25000 && purchaseamt<=50000) {
                    discount = (purchaseamt*7.5)/100;
                    totalamt = purchaseamt-discount;
                }
                else if (purchaseamt>50000 && purchaseamt<=100000) {
                    discount = (purchaseamt*10)/100;
                    totalamt = purchaseamt-discount;
                }
                else if (purchaseamt>100000) {
                    discount = (purchaseamt*12.5)/100;
                    totalamt = purchaseamt-discount;
                }
                break;
            }
            default: { //Default case if the case entered is wrong
                System.out.println("Invalid input");
            }
        }
        System.out.println('\n'+'\n'+'\t'+"Invoice");
        System.out.println("Customer's Name: "+name);
        System.out.println("Customer's Address: "+address);
        System.out.println("Purchase Amount: "+purchaseamt);
        System.out.println("Discounted Amount: "+totalamt);

        sc.close(); //Closing scanner object
    }
}

/*
   Variable    |  Datatype  |                              Description                                 |
   name        |   String   | Takes input from the user                                                |
   address     |   String   | Takes input from the user                                                |
   purchaseamt |   double   | Arithmetical operations                                                  |
   discount    |   Double   | Arithmetical operations                                                  |
   totalamt    |   Double   | Arithmetical operations                                                  |
   choice      |   char     | Used for switch case                                                     |
*/