package ShapesType;

import GraphicEditor.AbstractShape;

import java.awt.*;

public class Triangle extends AbstractShape {
    public Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public String chooseBorderColor(Color color) {
        String result;
        if (color == Color.red) {
            result = "Red";
        } else if (color == Color.yellow) {
            result = "Yellow";
        } else if (color == Color.green) {
            result = "Green";
        } else {
            result = "Black (Default Border Color)";
        }
        return result;
    }

    @Override
    public double adjustBorderWidth(double value) {
        return value;
    }

    @Override
    public void createCopy() {
        System.out.println("Triangle copy created");
    }

    @Override
    public void moveToPosition(double x, double y) {
        System.out.println("Triangle moved to position - x = "  + x + ", y = " + y);
    }

    @Override
    public double getScale(double scale) {
        return scale;
    }

    @Override
    public void delete() {
        System.out.println("Selected triangle deleted!");
    }
}
