package square;
import form.form;
public class square extends form {
    private double side;
    public square(double side) {
        this.side=side;
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
