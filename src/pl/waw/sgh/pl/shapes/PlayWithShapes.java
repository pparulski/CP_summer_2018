package pl.waw.sgh.pl.shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
       /*/ Rectangle r1 = new Rectangle(4,5);
        System.out.println(r1);
        System.out.println(r1.calcSurface());

        System.out.println();

        Circle c1 = new Circle(4);
        System.out.println(c1);
        System.out.println(c1.calcSurface());

        System.out.println();

        Equaltriangle t1 = new Equaltriangle(4);
        System.out.println(t1);
        System.out.println(t1.calcSurface());

        System.out.println();

        GenericTriangle g1 = new GenericTriangle(4,4, 60);
        System.out.println(g1);
        System.out.println(g1.calcSurface()); /*/

        ShapeCalculation[] myShapes = new ShapeCalculation[5];
        myShapes[0] = new Rectangle(3,4);
        myShapes[1] = new Circle(5);
        myShapes[2] = new Rectangle(6,7);
        myShapes[3] = new Equaltriangle(4);
        myShapes[4] = new GenericTriangle(4,4,60);

        for (ShapeCalculation s : myShapes) {
            System.out.println(s.toString());
            System.out.println("Perimeter: " + s.calcPerimeter());
            System.out.println("Surface: " + s.calcSurface());

            System.out.println();

        }

    }
}