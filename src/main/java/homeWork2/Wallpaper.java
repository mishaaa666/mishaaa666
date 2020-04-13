package homeWork2;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input numbers of line: ");
        int line = in1.nextInt();

        for (int column = 1; column <= line; column++) {
            System.out.println();
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= 3; k++) {
                    System.out.print("+");
                }
            }
        }
        in1.close();
    }
}