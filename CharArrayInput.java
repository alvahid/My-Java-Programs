import java.util.*;
public class CharArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a[] = new char[8];
		System.out.println("Enter the word 'computer'");
		for(int i=0; i<8; i++) {
			a[i] = sc.next().charAt(0);
		}
		for(int i=0; i<8; i++) {
			System.out.print(a[i]);
		}
		sc.close();
	}
}
