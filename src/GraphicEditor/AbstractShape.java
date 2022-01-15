package GraphicEditor;

import Interfaces.*;

import java.awt.*;

public abstract class AbstractShape implements Borderable, Copyable, Deleteable, Moveable, Scaleable {
    private final double x;
    private final double y;

    public AbstractShape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String getName() {
        return "shape";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getColor(Color color) {
        String result;
        if (color == Color.gray) {
            result = "Gray";
        } else if (color == Color.pink) {
            result = "Pink";
        } else if (color == Color.orange) {
            result = "Orange";
        } else {
            result = "White (Default Border Color)";
        }
        return result;
    }
}
