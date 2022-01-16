package graphic.editor;
import shapes.type.Circle;
import shapes.type.Hexagon;
import shapes.type.Triangle;
import shapes.type.Quad;
import shapes.type.Rhombus;
public class GraphicEditor {
    public static void main(String[] args) {

        //Create Shape
        //Can be Circle, Hexagon, Quad, Rhombus, Triangle
        Shape shape = new Rhombus();
        shape.setName("Rhombus");
        shape.setX(4);
        shape.setY(8.9);
        System.out.println(shape.getName() + " created at position - x = " + shape.getX() + ", y = " + shape.getY());

        //Set shape color
        shape.setShapeColor(255,96,87);
        System.out.println("Shape color is - " + shape.getShapeColor());
        //System.out.println("Shape color - " + shape1.setColor(););

        //Set Border
        shape.setBorderColor(88,55,66);
        shape.setBorderWidth(5.5);
        System.out.println("Border settings: \ncolor - " + shape.getBorderColor() + "\nwidth - " + shape.getBorderWidth());

        //Set scale
        System.out.println("Scale is - " + shape.getScale(100));

        //Clone shape
        Shape clone = null;
        try {
            clone = (Shape) ((Rhombus) shape).clone();
            clone.setName("Rhombus(clone)");
            clone.setX(30.3);
            clone.setY(80.5);
            System.out.println(clone.getName() + " created at position x - " + clone.getX() + " y - " + clone.getY());

        } catch (CloneNotSupportedException e) {
            System.out.println("The object cannot be cloned");
        }

        //Move shape
        clone.moveToPosition(100.3,289.7);

        //Delete shape
        clone.delete(clone.getName());
        clone = null;
        System.gc();

        //Create other Shape
        //Can be Circle, Hexagon, Quad, Rhombus, Triangle
        Shape shape1 = new Rhombus("Triangle - 2", 6.3, 8.5);
        System.out.println(shape1.getName() + " created at position - x = " + shape1.getX() + ", y = " + shape1.getY());
    }
}
