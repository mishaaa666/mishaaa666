package homeWork1;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in1.nextInt();
        int b = a % 2;
        boolean flag = (b == 1);

        if (b == 1 ) {
            System.out.println(flag);
        } else if (b == 0) {
            System.out.println(flag);
        }
    }
}
