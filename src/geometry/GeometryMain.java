package geometry;
import java.util.ArrayList;

public class GeometryMain {
	public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(5, 10));
        shapes.add(new Circle(7));
        shapes.add(new Triangle(4, 6));

        try {
            for (Shape shape : shapes) {
                shape.displayArea();
                if (shape instanceof Rectangle) {
                    ((Rectangle) shape).calculateArea();
                } else if (shape instanceof Circle) {
                    ((Circle) shape).calculateArea();
                } else if (shape instanceof Triangle) {
                    ((Triangle) shape).calculateArea();
                }
                System.out.println("-------------");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

}
