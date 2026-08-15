
public class LogicalOperators {

	public static void main (String args[]) {
		int x = 8 ;
		int y = 10;
		int z = 17;
		boolean bool1 = (z>x)&&(z>y)?true : false;
		System.out.println("The result is: "+bool1);
		
		int r = 50;
		boolean bool2 = (r%5==0)?true:false;
		System.out.println("the number 5 is divisible by 50: "+bool2);
	}
}
