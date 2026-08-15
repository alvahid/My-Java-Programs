import java.util.*;
public class NumberSwapping {

	public String swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		String ret = "Mission Complete";
		System.out.println("Swapped value "+'\n'+"Num1 = "+ a +'\n'+"Num2 = "+ b+'\n'+ret);
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberSwapping obj = new NumberSwapping();
		int x , y;
		System.out.println("Enter two numbers: ");
		System.out.print("Num1: ");
		x = sc.nextInt();
		System.out.print("Num2: ");
		y = sc.nextInt();
		obj.swap(x , y); 
		sc.close();
	} 
}
