
public class Int3 {

	public static void main (String args[]) {
		int x = 61;
		int y = 23;
		int z = 45;
		
		if(x > y && x > z) {
            System.out.println("Largest number is:"+x);
        }
		else if(y > z){
            System.out.println("Largest number is:"+y);
        }
        else {
            System.out.println("Largest number is:"+z);
        }
	}
}
