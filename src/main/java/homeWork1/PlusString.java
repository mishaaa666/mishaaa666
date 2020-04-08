package homeWork1;

import java.util.Scanner;

public class PlusString {

    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in1.nextInt();
        String strA = Integer.toString(a);
        //System.out.println(strA);

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input b: ");
        int b = in2.nextInt();
        String strB = Integer.toString(b);
       // System.out.println(strB);

        String c = strA + strB;
        System.out.println(c);
    }
}
