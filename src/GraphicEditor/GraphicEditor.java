package GraphicEditor;
import ShapesType.*;

import java.awt.*;

public class GraphicEditor {
    public static void main(String[] args) {
        //Create Shape
        //Can be Circle, Hexagon, Quad, Rhombus, Triangle
        AbstractShape abstractShape = new Circle(6.3, 8.5);
        System.out.println("Created " + abstractShape.getName() + " at position - x = " + abstractShape.getX() + ", y = " + abstractShape.getY());

        //Set color
        //Should be Gray, Pink, Orange, otherwise it will be White
        System.out.println("Shape color - " + abstractShape.getColor(Color.gray));

        //Set Border
        //Should be Red, Yellow, Green, otherwise it will be Black
        System.out.println("Border settings: \ncolor - " + abstractShape.chooseBorderColor(Color.red) + "\nwidth - " + abstractShape.adjustBorderWidth(10));

        //Copy shape
        abstractShape.createCopy();

        //Set scale
        System.out.println("Scale is - " + abstractShape.getScale(100));

        //Move shape
        abstractShape.moveToPosition(100.3,289.7);

        //Delete shape
        abstractShape.delete();
    }
}
