//PRACTICAL 13
//importing java utility class
//program to convert binary to decimal
import java.util.*;
public class P3BinaryToDecimal {
	//main method
	public static void main(String[]args) {
		//new scanner object
		Scanner sc = new Scanner(System.in);
		//taking input
		System.out.println("Enter a binary number: ");
		int num = sc.nextInt();
		int  temp=num,modval;
		double sum=0;
		int power = 0;
		double multiply = 0,pow;
		//do while loop to convert binary to decimal
		do {
			modval=temp%10;
			temp/=10;
			pow = Math.pow(2,power);
			multiply = modval*pow;
			sum+=multiply;
			++power;
		}while (temp>0);
		//FINAL OUTPUT
		System.out.println("Decimal value: "+sum);
	}
}