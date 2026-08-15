import java.util.*;
public class ObjectArea {

	public int area(int l, int b) {
		int result = l*b;
		System.out.println("Area of the rectangle: "+result);
		return result;
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ObjectArea obj1 = new ObjectArea();
		int y,x;
		System.out.println("Enter the length of the rectangle: ");
		y = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle: ");
		x = sc.nextInt();
		obj1.area(y, x);
		sc.close();
	}
}
