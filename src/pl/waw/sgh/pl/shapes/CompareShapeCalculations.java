package pl.waw.sgh.pl.shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareShapeCalculations {

    public static void main(String[] args) {
        ShapeCalculation s1 = new Rectangle(5,4);
        ShapeCalculation s2 = new Circle(4);
        ShapeCalculation s3 = new Rectangle(5,6);
        ShapeCalculation s4 = new Equaltriangle(4);
        ShapeCalculation s5 = new GenericTriangle(4,4,60);

        List<ShapeCalculation> shapeList = new ArrayList<>();
        shapeList.add(s1);
        shapeList.add(s2);
        shapeList.add(s3);
        shapeList.add(s4);
        shapeList.add(s5);

        for (ShapeCalculation s : shapeList) {
            System.out.println(s);
        }

        System.out.println();

        Collections.sort(shapeList);

        for (int i = 0; i < shapeList.size(); i++){
            ShapeCalculation s = shapeList.get(i);
            System.out.println(s.toString());
            System.out.println(s.calcSurface());
        }
    }
}
