import java.util.*;
public class Bill_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customers name: ");
		String nm = sc.next();
		
		System.out.println("Enter Bill number: ");
		int bNo = sc.nextInt();
		
		System.out.println("Enter number of calls made by the customer: ");
		int callNo = sc.nextInt();
		Bill billNew = new Bill(bNo,nm,callNo);
		
		billNew.call = callNo;
		billNew.Calculate(callNo);
		System.out.println("");
		billNew.Display();
	}
}
