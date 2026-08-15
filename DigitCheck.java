import java.util.*;
public class DigitCheck {

	public static void main (String args[]) {
	
		Scanner ns = new Scanner (System.in);
		int f ;
		
		System.out.print("Enter a number: ");
		f= ns.nextInt();

		if (f<100 && f>=10) {
			System.out.println("The number "+f+" is two digit");
		}
		if (f<1000 && f>=100) {
			System.out.println("The number "+f+" is three digit");
		}
		if (f<10000 && f>=1000) {
			System.out.println("The number "+f+" is four digit");
		}
		ns.close();
	}
}
