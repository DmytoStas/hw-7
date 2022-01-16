package graphic.editor;
import interfaces.Borderable;
import interfaces.Moveable;
import interfaces.Scaleable;

public abstract class Shape implements Borderable, Moveable, Scaleable {
    private double x;
    private double y;
    private String name;
    private int r;
    private int g;
    private int b;

    public Shape() {
        name = "Shape";
    }

    public Shape(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void setShapeColor(int r, int g, int b) {
        if (r > 255 || g > 255 || b > 255) {
            this.r = 0;
            this.g = 0;
            this.b = 0;
        } else {
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getShapeColor() {
        return String.format("#%02x%02x%02x", r, g, b);
    }

}