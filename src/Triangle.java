
public class Triangle extends Figure implements IPrint{
    double a,b,c;

    public Triangle() {
        a=10;
        b=10;
        c=10;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // the method below is an implementation of Heron's formula
    @Override
    double calculateArea() {
        double area = 0;
        double p =(a+b+c)/2;
        area = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        return area;
    }

    @Override
    double calculatePerimeter() {
        return (a+b+c);
    }

    @Override
    public void print() {
        System.out.println("The area of square is equal to " + calculateArea() + " and the perimeter is equal to :"
                + calculatePerimeter());
    }
}
