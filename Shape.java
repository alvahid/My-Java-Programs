
public class Shape {

	public static void main(String[] args) {
		float r = 12;
		int l = 4;
		int b = 6;
		int s = 5;
		Circle cl = new Circle();
		Square sq = new Square();
		Rectangle rc = new Rectangle();
		
		cl.area(r);
		sq.area(s);
		rc.area(l, b);
	}
}
