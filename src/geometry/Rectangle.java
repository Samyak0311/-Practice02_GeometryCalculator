package geometry;

public class Rectangle extends Shape {
	private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

}
