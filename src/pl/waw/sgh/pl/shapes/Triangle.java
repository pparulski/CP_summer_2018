package pl.waw.sgh.pl.shapes;
import pl.waw.sgh.pl.shapes.Shape;

public abstract class Triangle extends Shape{


    public Triangle(double tra) {
        super(tra);
    }

    public Triangle(double gena, double genb, double sinalp) {
        super(gena, genb, sinalp);
    }



    public  void setPar(double a, double b) {
        parA = a;
        parB = b;

    }

    public  void setParr(double a, double b, double c){
        parA = a;
        parB = b;
        parC = c;
    }




}
