
public class IfStatement {

	public static void main (String args []) {
		
		int b = 20;
		int c = -25;
		int d = 0;
		
		if (b>0) { 
			System.out.println("The number "+b+" is greater than 0");
		}
		else {
			System.out.println("The number "+b+" is smaller than 0");
		}
		if (0>c) {
			System.out.println("The number 0 is greater than "+c);
		}
		else {
			System.out.println("The number "+c+" is greater than 0");
		}
		if (d==0) {
			System.out.println("int "+d+" is equal to 0");
		}
		else {
			System.out.println("int "+d+" is not equal to 0");
		}
		if (b==0) {
			System.out.println("int "+b+" is equal to 0");
		}
		else {
			System.out.println("int "+b+" is not equal to 0");
		}
	}
}
