import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Figure c1 = new Circle (100);
        Figure s1 = new Square (10);
        Figure t1 = new Triangle (3.0,4.0,5.0);
        ((Circle) c1).print();
        ((Square) s1).print();
        ((Triangle) t1).print();
    }
}
