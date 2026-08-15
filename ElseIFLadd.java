import java.util.*;
public class ElseIFLadd {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		float marks;
		String name;
		
		System.out.print("Enter you name: ");
		name = sc.next();
		System.out.print("Enter your marks/percentage: ");
		marks = sc.nextFloat();
		
		if(marks>=90 && marks<=100) {
			System.out.println("Excellent! "+name+" your grade is A+");
		}
		else if(marks>=80 && marks<=89) {
			System.out.println("Good! "+name+" your grade is A");
		}
		else if(marks>=70 && marks<=79) {
			System.out.println("Good "+name+" your grade is B");
		}
		else if(marks>=60 && marks<=69) {
			System.out.println("Pretty average "+name+" your grade is C");
		}
		else if(marks>=50 && marks<=59) {
			System.out.println("Improvement is needed! "+name+" your grade is D");
		}
		else if(marks<49 && marks>=0) {
			System.out.println("Oops! "+name+" you failed");
		}
		else if(marks>100 || marks<=-1) {
			System.out.println("Invalid input");
		}
		sc.close();
	}
}
