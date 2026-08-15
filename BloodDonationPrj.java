import java.util.Scanner;

public class BloodDonationPrj {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		float weight;
		
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		System.out.print("Enter your weight: ");
		weight = sc.nextFloat();
		
		if (age>=18 && age<=50) {
			if (weight>=50) {
				System.out.println("Your aligible for blood donation");
			}
			else {
				System.out.println("Your not aligible for blood donation");
			}
		}
		else {
			System.out.println("Your not aligible for blood donation");
		}
		sc.close();
	}
}
