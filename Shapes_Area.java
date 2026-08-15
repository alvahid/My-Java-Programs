import java.util.Scanner;

public class Shapes_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating object of the class Areas
        Areas areaCalculation = new Areas();

        System.out.println("Enter side of a square: ");
        int side = sc.nextInt();
        //passing value to the method getArea
        areaCalculation.getArea(side);

        System.out.println("Enter the radii of a circle: ");
        double radius = sc.nextDouble();
        //passing value to the method getArea
        areaCalculation.getArea(radius);

        System.out.println("Enter length and breadth of a rectangle: ");
        int len = sc.nextInt();
        int breadth = sc.nextInt();
        //passing value to the method getArea
        areaCalculation.getArea(len,breadth);

        System.out.println("Enter all the three sides of a triangle: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        //passing value to the method getArea
        areaCalculation.getArea(s1,s2,s3);
    }
}
