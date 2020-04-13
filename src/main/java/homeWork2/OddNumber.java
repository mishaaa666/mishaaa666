package homeWork2;

public class OddNumber {
    public static void main(String[] args) {

        int [] arr = new int[8];
        int sum = 0;

        arr [0]= 0;
        arr [1] = 5;
        arr [2] = 2;
        arr [3] = 4;
        arr [4] = 7;
        arr [5] = 1;
        arr [6] = 3;
        arr [7] = 19;


        for (int i = 0; i < arr.length; i++){
            int mod = arr [i] % 2;
            if (mod !=  0){
               sum += arr [i];

           }
       }
        System.out.println(sum);
    }
}
