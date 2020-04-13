package thirdLesson;

import java.util.Arrays;

public class Methods {

    static String privet = "Hello";

    public static void main(String[] args) {
        //justShow();
//        withParameter(privet);
//        nextParameter("***", 4, true);

//       int result = getLenght("Hello");
//        System.out.println(result);

        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Main  " + Arrays.toString(arr));
        increment(arr);
        System.out.println("Again Main  " + Arrays.toString(arr));
    }

    public static void justShow() {
        System.out.println("Hello");

    }

    static void withParameter(String str){
        System.out.println(str);
    }

    static void nextParameter(String str, int count, boolean flag){
        if (flag){
            for (int i = 0; i < count; i++){
                System.out.println(str);
            }
        }
    }
    static int getLenght(String str) {
            int value = str.length();
            return value;
        }

    static void increment(int [] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i]+= 1;
        }
        System.out.println("Method  " + Arrays.toString(arr));
     }

}
