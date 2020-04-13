package homeWork2;

import java.util.Scanner;

public class FlatNumber {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input flat number: ");
        int flat = in1.nextInt();
//        int flat;
        int floor;
        int porch;
       // for (flat = 1; flat <= 144; flat++) {
            System.out.println("Flat № " + flat);
             if (flat >= 1 && flat <= 144) {

            porch = (flat - 1)/ 36 + 1;
            System.out.println("Porch № " + porch);

            floor = (flat - 1) / 4 % 9 + 1;
            System.out.println("Floor № " + floor);
        }


        if (flat >= 145) {
            System.out.println("There is no apartment with this number in this house!");
        }
        in1.close();
    }
}

