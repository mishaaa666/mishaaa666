package secondLesson;

public class ArraysSimple {
    public static void main(String[] args) {
//        int [] mass = new int [10]; //вместительность массива
//

//        System.out.println(mass.length);
//        mass[0] = 1; //обращение к элементу массива
//        mass[1] = 2;
//        System.out.println(Arrays.toString(mass));
//
//        инициализация массива
//        int [] arr = {3, 4, 1, 0};
//        System.out.println(Arrays.toString(arr));
//
//        arr [0] = 9;
//        System.out.println(Arrays.toString(arr));



//        for (int i = 0; i < 10; i++) {
//            mass[i] = +1;
//        }
//        mass = new int[13];
//        System.out.println(Arrays.toString(mass));


        int [][] arr = new int[4][4]; //двумерный массив

        arr[0][0] = 1;
        arr[0][1] = 2; //первая строчка второй столбец
        arr[0][2] = 3;
        arr[0][3] = 4;

        //проход по элементам массива
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }


    }
}
