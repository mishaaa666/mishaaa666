package homeWork1;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in1.nextDouble();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input b: ");
        double b = in2.nextDouble();

        Scanner in3 = new Scanner(System.in);
        System.out.print("Input c: ");
        double c = in3.nextDouble();

        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        double square = Math.sqrt(s);

        System.out.println("The area of triangle is " + square);

    }
}
