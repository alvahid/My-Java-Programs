import java.util.*;
public class DoubleDimensionalArray {

	public static void main(String[] args) {
		int add = 0,row = 1;
		Scanner sc = new Scanner(System.in);
		int array[][] = new int[3][5];
		System.out.println("Enter input for double dimensional array");
		System.out.println("Row 1");
		for(int i= 0;i<3;i++) {
			for(int j=0;j<5;j++) {
				array[i][j] = sc.nextInt();
				
			}
			System.out.println();
			row++;
			if(i==2) {
				break;
			}
			System.out.println("Row"+ row);
		}
		System.out.println('\n'+"Array: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		row =1;
		for(int i = 0;i<3;i++) {
			
			for(int j=0;j<5;j++) {
				add+=array[i][j];
			}
			
			System.out.println("Sum of addition for row "+row+" "+add);
			row++;
			
		}
		System.out.println();
		add=0;
		row = 1;
		for(int j=0;j<5;j++) {
			add=0;
			for(int i=0;i<3;i++) {
				add=add+array[i][j];
			}
			System.out.println("Sum of column "+row+" "+add);
			row++;
		}
		sc.close();
	} 
	
}
