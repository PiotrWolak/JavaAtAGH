package Calc;

import static java.lang.System.exit;

public class Circle extends Figure implements IPrint {
    double radius;

    public Circle(){
        radius = 10;
    }
    public Circle(double radius){
        if(radius>0){
            this.radius = radius;
        }
        else exit(0);
    }

    @Override
    protected double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    protected double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void print() {
        System.out.println("The area of circle is equal to " + calculateArea() + " and the perimeter is equal to :"
        + calculatePerimeter());
    }
}
