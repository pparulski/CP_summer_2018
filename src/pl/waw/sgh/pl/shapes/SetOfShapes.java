package pl.waw.sgh.pl.shapes;

import java.util.HashSet;
import java.util.Set;

public class SetOfShapes {

    public static void main(String[] args) {

        ShapeCalculation s1 = new Rectangle(5,4);
        ShapeCalculation s2 = new Circle(4);
        ShapeCalculation s3 = new Rectangle(5,6);
        ShapeCalculation s4 = new Equaltriangle(4);
        ShapeCalculation s5 = new GenericTriangle(4,4,60);

        Set<ShapeCalculation> shapeSet = new HashSet<>();

        shapeSet.add(s1);
        shapeSet.add(s2);
        shapeSet.add(s3);
        shapeSet.add(s4);
        shapeSet.add(s5);

        for (ShapeCalculation s : shapeSet){
            System.out.println(s);
        }

    }
}
