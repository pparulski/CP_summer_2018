package pl.waw.sgh.pl.shapes;

public class GenericTriangle extends Triangle{

    public GenericTriangle(double gena, double genb, double sinalp) {
        super(gena, genb, sinalp);
    }

    @Override
    public double calcSurface() {
        return (0.5)*(parA*parB*(Math.sin(Math.toRadians(parC))));
    }

    @Override
    public String toString() {
        return "My " + super.toString();
    }

    @Override
    public double calcPerimeter() {
        return parA+parB+parC;
    }
}
