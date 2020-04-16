package HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            List<Integer> list = new ArrayList<>();
            Integer value = 0;
            while (value >= 0) {
                System.out.print("Введите число: ");
                value = read.nextInt();
                if (value >= 0) {
                    list.add(value);
                }
            }

            System.out.println(list.toString());
        }
    }

