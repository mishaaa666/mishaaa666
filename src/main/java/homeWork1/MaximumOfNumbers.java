package homeWork1;

import java.util.Scanner;

public class MaximumOfNumbers {

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

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        } else if (a == b && a > c) {
            System.out.println(a);
        } else if (a == c && a > b) {
            System.out.println(a);
        } else if (a == b && a == c) {
            System.out.println(a);
        }
    }
}
