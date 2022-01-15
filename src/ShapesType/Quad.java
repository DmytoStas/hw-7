package ShapesType;

import GraphicEditor.AbstractShape;

import java.awt.*;

public class Quad extends AbstractShape {
    public Quad(double x, double y) {
        super(x, y);
    }

    @Override
    public String getName() {
        return "Quad";
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
        System.out.println("Quad copy created");
    }

    @Override
    public void moveToPosition(double x, double y) {
        System.out.println("Quad moved to position - x = "  + x + ", y = " + y);
    }

    @Override
    public double getScale(double scale) {
        return scale;
    }

    @Override
    public void delete() {
        System.out.println("Selected quad deleted!");
    }
}
