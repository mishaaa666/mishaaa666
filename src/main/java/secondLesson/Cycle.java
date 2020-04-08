package secondLesson;

public class Cycle {

    public static void main(String[] args) {



//        boolean flag = true;
//        int count = 0;
//        String str = "*";//если убрать - будет одна звездочка, цикл все время будет начинаться сначала

        //while - логическое условие
        //       while (flag){
        //          System.out.println(str);
        //          str += "*";
        //          count ++;
        //          if (count == 20){
        //              flag = false; //прерывание цикла
        //break; //прерывание цикла
        //         }

        //     }



   //     int x = 0;
   //     do {
   //         System.out.println(x);
   //         x++;
        //   } while (x <= 10);




   //     for (int i = 0; i < 10; i++){



//            for (int j = 0; j < 10; j++){
//                System.out.print("Iteration " + i + " ");
//                System.out.println(j);
//            }
//            if (i == 2) {
//                continue; //пропускает итерацию i = 2
//            }
//            if (i == 7){
//                break; //прерывает
//            }
//            System.out.println(i);
//        }

        String [] arr = {"Hello", "Hi", "Privet"};
        for (String str : arr){
            System.out.println(str);
        }
    }
}
