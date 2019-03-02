public class Circle extends Figure implements IPrint {
    double radius;

    public Circle(){
        radius = 10;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void print() {
        System.out.println("The area of circle is equal to " + calculateArea() + " and the perimeter is equal to :"
        + calculatePerimeter());
    }
}
