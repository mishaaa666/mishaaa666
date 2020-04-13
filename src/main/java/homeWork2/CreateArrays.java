package homeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CreateArrays {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = in1.nextInt();

        int [] arr = new int[n];

        Random r= new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i]=r.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(arr));

        in1.close();
    }
}
