package homeWork2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input number from 4 to 16: ");
        int n = in1.nextInt();

        long factorial = 6;

        if (n < 4){
            System.out.println("Number entered incorrectly ");
        } else {
            if (n >= 4 && n <= 16) {
                for (int i = 3; i < n; i++) {
                    factorial *= i+1;

                    //  System.out.println("You win");
                } System.out.println(n + "! = " + factorial);
            }else {
                if (n > 16){
                    System.out.println("Number entered incorrectly ");
                }

            }
        } in1.close();
    }
}
