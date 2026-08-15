
public class LeapYrs {

	public static void main (String args []) {
		int y = 2016;
		if (y%4==0 && y%100!=0) {
			System.out.println("The year "+y+" is leap year");
		}
		else {
			System.out.println("The year "+y+" is not a leap year");
		}
		
		y = 2020;
		if (y%4==0 && y%100!=0) {
			System.out.println("The year "+y+" is leap year");
		}
		else {
			System.out.println("The year "+y+" is not a leap year");
		}
		
		y = 2000;
		if (y%4==0 && y%100!=0) {
			System.out.println("The year "+y+" is leap year");
		}
		else {
			System.out.println("The year "+y+" is not a leap year");
		}
		y = 2017;
		if (y%4==0 && y%100!=0) {
			System.out.println("The year "+y+" is leap year");
		}
		else {
			System.out.println("The year "+y+" is not a leap year");
		}
	}
}
