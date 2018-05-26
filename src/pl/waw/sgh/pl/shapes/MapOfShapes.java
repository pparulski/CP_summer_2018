package pl.waw.sgh.pl.shapes;

import java.util.Map;
import java.util.HashMap;

public class MapOfShapes {
    public static void main(String[] args) {
        Map<String, ShapeCalculation> myMap = new HashMap<>();
        myMap.put("Rect 1", new Rectangle(4,6));
        myMap.put("Circle 1", new Circle(4));
        myMap.put("Rect 2", new Rectangle(2,3));

        myMap.put("Rect 2", new Rectangle(666, 66)); //this will replace the upper one


        for (String idx : myMap.keySet()) {
            ShapeCalculation s = myMap.get(idx);
            System.out.println(s); //note the random order
        }
    }
}
