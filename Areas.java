public class Areas {
    //Creating methods with same name but for different function(polymorphism)
    //First method to find area of a square
    public int getArea(int side) {
        int area= side*side;
        System.out.println("Area of the square: "+area);
        return area;
    }
    //Second method to find area of a circle
    public double getArea(double radii) {
        double area = 22/7*(radii*radii);
        System.out.println("Area of the circle: "+area);
        return area;
    }
    //Third method to find area of a rectangle
    public int getArea(int length,int breadth) {
        int area = length*breadth;
        System.out.println("Area of the rectangle: "+area);
        return area;
    }
    //Fourth method to find area of a triangle
    public double getArea(int side1, int side2, int side3) {
        float semi_perimeter = (side1+side2+side3)/2;
        double temp_area = semi_perimeter*(semi_perimeter-side1)*(semi_perimeter-side2)*(semi_perimeter-side3);
        double area = Math.sqrt(temp_area);
        System.out.println("Area of the triangle: "+area);
        return area;
    }
}
