//PRACTICAL 12
import java.util.*;
public class Pr12Student {

	String Name;
	int mm,scm,comp;
	
	//Method check for checking marks and giving options for subject selection
	void check() {
		//calculating average to use in if else
		double avg =(mm+scm+comp)/3;
		//Condition 1 for Science and Computer
		if(mm>90 && scm>90 && comp>90) {
			System.out.println(Name+" is eligible for Science and Computer");
		}
		//Condition 2 for Bioscience
		else if(avg>=90) {
			System.out.println(Name+" is eligible for Bioscience");
		}
		//Condition 3 for Science and Hindi
		else if(avg>=80&&avg<90) {
			System.out.println(Name+" is eligible for Science and Hindi");
		}
	}
	//Constructor for printing output
	public Pr12Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Math marks: ");
		mm = sc.nextInt();
		System.out.println("Enter your Science marks: ");
		scm = sc.nextInt();
		System.out.println("Enter your Computer marks: ");
		comp = sc.nextInt();
	}
}
