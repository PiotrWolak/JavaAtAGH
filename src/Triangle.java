import static java.lang.System.exit;

public class Triangle extends Figure implements IPrint{
    double a,b,c;

    public Triangle() {
        a=3;
        b=4;
        c=5;
    }

    public Triangle(double a, double b, double c) {
        if(canBecomeATriangle(a,b,c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else exit(0);
    }
    // method that verify whether you can make a triangle
    public static boolean canBecomeATriangle(double a, double b, double c){
        if(a+b>c || a+c>b || b+c>a) return true;
        else{
            System.out.println("You cannot build a triangle with given lenghts, silly");
            return false;
        }
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
        System.out.println("The area of triangle is equal to " + calculateArea() + " and the perimeter is equal to :"
            + calculatePerimeter());
}
}
