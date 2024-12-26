import models.*;

import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        Shape t = new Triangle(3, 4, 5);
        Shape r = new Rectangle(2, 5);
        Shape c = new Circle(7);

        Square s = new Square(9);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(t);
        shapes.add(r);
        shapes.add(c);
        shapes.add(s);

        for (Shape shape : shapes) {
            System.out.println("++++++++++++++++++");
            printData(shape);
        }
    }

    // Polymorphism - code in general rather than in specific
    public static void printData(Printable obj) {
        obj.print();
    }
}
