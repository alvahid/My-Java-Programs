import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while(num>0) {
			
		}
		int div = 2;
		System.out.println("Digits in Binary System");
		while(num>2) {
			num/=div;
			if(num%2==0) {
				System.out.print("0");
			}
			else{
				System.out.print("1");
			}
		}
	}
}
