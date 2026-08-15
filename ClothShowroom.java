//PRACTICAL 5
/*A program for cloth show room festival discounts and to display discounted amount*/
import java.util.*; //Importing java utility class
public class ClothShowroom { //Creating new class
	public static void main(String[] args) {
		//Creating new Scanner object
		Scanner input = new Scanner(System.in);
		
		//Initializing variable
		double pamt, discount=0;
		
		System.out.print("Enter the amount of purchase: ");
		pamt = input.nextDouble();
		//Taking input from the user
		
		//if, else-if a conditional statement
		if(pamt<=2000) {
			discount = (5*pamt)/100;
			discount = pamt-discount;
		}
		else if(pamt>2000 && pamt<=5000) {
			discount = (25*pamt)/100;
			discount = pamt-discount;
		}
		else if(pamt>5000 && pamt<=10000) {
			discount = (35*pamt)/100;
			discount = pamt-discount;
		}
		else if(pamt<10000) {
			discount = (50*pamt)/100;
			discount = pamt-discount;
		}
		
		//Printing final result
		System.out.println("Amount to be paid: "+discount);
		
		//Closing Scanner object
		input.close();
	}
}
