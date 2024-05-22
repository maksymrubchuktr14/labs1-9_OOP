package Lab6;

public class Pyramid extends Shape {

    private double s;
    private double h;

    public Pyramid(double radius, double s, double h) {

        this.s = s;
        this.h = h;
        this.volume = (1.0 / 3) * Math.PI * radius * radius * h;

    }

    }
