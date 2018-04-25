package pl.waw.sgh.pl.shapes;

import org.w3c.dom.css.Rect;

public class PlayWithShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        System.out.println(r1);
        System.out.println(r1.calcSurface());

        // calls toString automatically


        Circle c1 = new Circle(4);
        System.out.println(c1);
        System.out.println(c1.calcSurface());

        Equaltriangle t1 = new Equaltriangle(4);
        System.out.println(t1);
        System.out.println(t1.calcSurface());

        GenericTriangle g1 = new GenericTriangle(4,4, 60);
        System.out.println(g1);
        System.out.println(g1.calcSurface());


        System.out.println();

        Shape[] myShapes = new Shape[5];
        myShapes[0] = new Rectangle(3,4);
        myShapes[1] = new Circle(5);
        myShapes[2] = new Rectangle(6,7);
        myShapes[3] = new Equaltriangle(4);
        myShapes[4] = new GenericTriangle(4,4,60);

        for (Shape s : myShapes) {
            System.out.println(s.toString());
            // Avoid using instanceof and casting
            //if (s instanceof Rectangle)
            //    System.out.println("Surface: " + ((Rectangle)s).calcSurface() );
            System.out.println("Surface: " + s.calcSurface());
        }
    }
}

//create triangle as abstract and then few types of triangles (generic triangle, equal sides)