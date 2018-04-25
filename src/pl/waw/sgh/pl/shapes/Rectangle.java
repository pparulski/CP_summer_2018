package pl.waw.sgh.pl.shapes;

public class Rectangle extends Shape {

    //public Rectangle() {
        // call superclass (Shape) constructor
    //    super(1,2);}


    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double calcSurface() {
        return parA*parB;
    }

    @Override
    public String toString() {
        return "My " + super.toString();
    }

    @Override
    public double calcPerimeter() {
        return 2*parA+2*parB;
    }

}
