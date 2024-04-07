package geometry;
import geometry.Point;
import geometry.Circle;
public class zad2 {
    public static void main(String[] args) {
        Point center = new Point(3.0, 4.0);
        double radius = 5.0;
        Circle circle = new Circle(center, radius);
        System.out.println("Właściwości koła:");
        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole koła: " + circle.getArea());
    }
}