package Lab6;

public class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        this.volume = Math.PI * radius * radius * height;
    }
}