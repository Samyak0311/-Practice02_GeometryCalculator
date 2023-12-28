package geometry;

public class Circle extends Shape {
	 private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public void calculateArea() {
	        double area = Math.PI * Math.pow(radius, 2);
	        System.out.println("Area of Circle: " + area);
	    }

}
