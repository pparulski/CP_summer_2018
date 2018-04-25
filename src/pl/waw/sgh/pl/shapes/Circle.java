package pl.waw.sgh.pl.shapes;

public class Circle extends Shape {
    public Circle(double a) {
        super(a);
    }

    @Override
    public double calcSurface() {
        return Math.PI*Math.pow(parA,2);
    }

    @Override
    public String toString() {
        return "My " + super.toString();
    }
}