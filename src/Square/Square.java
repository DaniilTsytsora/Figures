package Square;
import Form.Form;
public class Square extends Form {
    private double side;
    public Square(double side) {
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
