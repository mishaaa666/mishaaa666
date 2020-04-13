package thirdLesson;

public class ExceptionSimple {


        public static void main(String[] args) {
//        try {
//            show();
//        } catch (ArithmeticException err){
//           err.printStackTrace();
//        }
//        System.out.println("Next iteration");
            try {
                makeExeption();
                show();

            } catch (NullPointerException e) {
                System.out.println("Phone mama");
            } catch (ArithmeticException r){
                System.out.println("Phone papa");
            } finally {
                System.out.println("it will work");
            }
            System.out.println("Next iteration");
        }

        static void show() {
            System.out.println(4/0);
        }

        static void makeExeption(){
            throw new NullPointerException("BEDA");
        }
    }