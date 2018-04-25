package pl.waw.sgh.pl.shapes;

public class Equaltriangle extends Triangle{

        public Equaltriangle(double tra) {
            super(tra);
        }

        @Override
        public double calcSurface() {
            return ((Math.pow(parA,2))*Math.sqrt(3))/4;
        }

        @Override
        public String toString() {
        return "My " + super.toString();
        }

        @Override
        public double calcPerimeter() {
                return (3*parA);
        }

}
