package shapes.type;

import graphic.editor.Shape;

public class Triangle extends Shape {
    private int r;
    private int g;
    private int b;
    private double value;
    private double scale;

    public Triangle() {
    }

    public Triangle(String name, double x, double y) {
        super(name, x, y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void setBorderColor(int r, int g, int b) {
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

    @Override
    public String getBorderColor() {
        return String.format("#%02x%02x%02x", r, g, b);
    }

    @Override
    public void setBorderWidth(double value) {
        this.value = value;
    }

    @Override
    public double getBorderWidth() {
        return value;
    }

    @Override
    public void moveToPosition(double x, double y) {
        System.out.println(getName() + " moved to position - x = " + x + ", y = " + y);
    }

    @Override
    public void setScale(double scale) {
        this.scale = scale;
    }

    @Override
    public double getScale() {
        return scale;
    }
}
