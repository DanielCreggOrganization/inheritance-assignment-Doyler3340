import ie.gmit.animal.*;
import ie.gmit.twodshapes.*;


public class Main {
    public static void main(String[] args) {
        
        Triangle triangleObjectl = new Triangle(10.0f, 5.0f, "scalene");
        ColouredTriangle colouredTriangleObject1 = new ColouredTriangle(12.1f, 3.4f, "isosceles", "Red");
        Circle circleobject1 = new Circle(3.3f, 4.4f, 5.7f);

        // triangleObjectl.setWidthCm(10.5f);
        // colouredTriangleObject1.setHeightCm(27.0f);
        // circleobject1.setWidthCm(11.1f);

        System.out.println("Triangle width in cm = " + triangleObjectl.getWidthCm());
        System.out.println(colouredTriangleObject1.getHeightCm());
        System.out.println( "Radius = " + circleobject1.findRadius() );
    }
    

} // End class
