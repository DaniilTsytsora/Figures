package rectangle;
import form.form;
public class rectangle extends form {
    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
