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
        Shape rhombus = new Rhombus();
        rhombus.setName("Rhombus");
        rhombus.setX(4);
        rhombus.setY(8.9);
        System.out.println(rhombus.getName() + " created at position - x = " + rhombus.getX() + ", y = " + rhombus.getY());

        //Set shape color
        rhombus.setShapeColor(255,96,87);
        System.out.println("Shape color is - " + rhombus.getShapeColor());

        //Set Border
        rhombus.setBorderColor(88,55,66);
        rhombus.setBorderWidth(5.5);
        System.out.println("Border settings: \ncolor - " + rhombus.getBorderColor() + "\nwidth - " + rhombus.getBorderWidth());

        //Set scale
        System.out.println("Scale is - " + rhombus.getScale(100));

        //Move shape
        rhombus.moveToPosition(100.3,289.7);

        //Delete shape
        rhombus.delete(rhombus.getName());
        rhombus = null;
        System.gc();

        //Create other Shape
        //Can be Circle, Hexagon, Quad, Rhombus, Triangle
        Shape shape1 = new Rhombus("Triangle - 2", 6.3, 8.5);
        System.out.println(shape1.getName() + " created at position - x = " + shape1.getX() + ", y = " + shape1.getY());
    }
}
