package homeWork1;

import java.util.Scanner;

public class ParallelogramArea {

    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in1.nextDouble();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input b: ");
        double b = in2.nextDouble();

        Scanner in3 = new Scanner(System.in);
        System.out.print("Input angle a & b: ");
        double degrees = in3.nextDouble();
        double radians = Math.toRadians(degrees);



        double sin = Math.sin(radians);

        double area = a * b * sin;
        System.out.println("The area of parallelogram is " +area);
    }
}
