public class MethodOverloading {

	public double volume (double r) {
		double V = (4/3)*(22/7)*r*r*r;
		System.out.println("Volume for sphere: "+V);
		return r;
	}
	public double voulme(double h, double r) {
		double V = (22/7)*r*r*h;
		System.out.println("Voulme of cylinder: "+V);
		return V;
	}
	public double volume(double l, double b, double h) {
		double V = l*b*h;
		System.out.println("Volume of cuboid: "+V);
		return V;
	}
}
