public class Square extends Figure implements IPrint {
    double side;


    public Square() {
        this.side = 10;
    }
    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }

    @Override
    double calculatePerimeter() {
        return 4*side;
    }

    @Override
    public void print() {
        System.out.println("The area of square is equal to " + calculateArea() + " and the perimeter is equal to :"
                + calculatePerimeter());
    }
}
