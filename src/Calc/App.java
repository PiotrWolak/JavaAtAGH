package Calc;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            menu();

        }

    }

    public static void menu() {

        Scanner input = new Scanner(System.in);
        System.out.println("which figure would you like to calculate?");
        System.out.println("1-circle, 2-square, 3-triangle");
        int choice = input.nextInt();
        // variable below holds number that is going to be passed
        // for a constructor of a given figure
        double argument;
        switch (choice) {
            case 1:
                System.out.println("enter radius");
                argument = input.nextDouble();
                Circle c = new Circle(argument);
                c.print();
                break;
            case 2:
                System.out.println("enter length");
                argument = input.nextDouble();
                Square s = new Square(argument);
                s.print();
                break;
            case 3:
                System.out.println("enter 3 sides of triangle separated by enter");
                double temp1, temp2, temp3;
                temp1 = input.nextDouble();
                temp2 = input.nextDouble();
                temp3 = input.nextDouble();
                Triangle t = new Triangle(temp1, temp2, temp3);
                t.print();
                break;
            default:
                System.out.println("Weź Ty się człowieku naucz wpisywać cyferki");
                menu();
        }
    }

}
