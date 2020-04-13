package homeWork2;

import java.util.Arrays;
import java.util.Random;

public class ArraysDouble {
    public static void main(String[] args) {
        int [] arr = new int [15];

        Random r= new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i]=r.nextInt();
        }

        int[] arr1 = ArrayDouble(arr);

        System.out.println("Array 1:" + Arrays.toString(arr));
        System.out.println("Array 2:" + Arrays.toString(arr1));
    }

    public static int[] ArrayDouble(int[] arr) {
        int [] arr1 = new int [arr.length * 2];

        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
            arr1[i + 15] = arr[i] * 2;
        }

        return arr1;
    }
}
