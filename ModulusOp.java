
public class ModulusOp {

	public static void main (String args[]) {
		//Checking that the number is divisible by 21//
		int y = 21; 
		String ter1 = (y%2==0)?"The number 21 is divisible by 2":"The number 21 is not divisible by 2";
		
		//Checking that the number is divisible by 20//
		int x = 20;
		String ter2 = (x%2==0)?"The number 20 is divisible by 2":"The number 20 is not divisible by 2";
		
		//Checking that the number is divisible by 2 and 3 and//
		int z = 30;
		String ter3 = (z%2==0)&&(z%3==0)?"The number 2 and 3 are divisible by 30":"The number 2 and 3 are not divisible by 30";
		
		//This statement is to the number is odd or even//
		int h = 77;
		String ter4 = (h%2!=0)?"The number is odd":"The Number is even";
		
		//checking that number is divisible by 5 or 10//
		int u = 26;
		String ter5 = (u%5==0)||(u%10==0)?"The number is divisible by 5 or 10":"The number not divisible by 5 and 101";
		
		System.out.println(ter1 + '\n' + ter2 + '\n' + ter3 + '\n' + ter4 + '\n' + ter5);
	}
}
