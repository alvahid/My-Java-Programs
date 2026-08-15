//PRACTICAL 13
import java.util.*;
public class Pr13BillMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customers name: ");
		String nm = sc.next();
		
		System.out.println("Enter Bill number: ");
		int bNo = sc.nextInt();
		
		System.out.println("Enter number of calls made by the customer: ");
		int callNo = sc.nextInt();
		//Passing values to the parameterized constructor
		Pr13Bill billNew = new Pr13Bill(bNo,nm,callNo);
		
		//Calling methods for their respective functions
		billNew.call = callNo;
		billNew.Calculate(callNo);
		System.out.println("");
		billNew.display();
	}
}
