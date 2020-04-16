package fourthLesson.classSimple;

import static fourthLesson.classSimple.User.makeString;

public class ExecuteClass {

    public static void main(String[] args) {

       // User.city = "New York";

        User jack = new User();
//        jack.name = "Jack";
//        jack.age = 20;
//        jack.setMarried(true);
        jack.info();

//        User hart = new User();
//        hart.name = "Hart";
//        hart.age = 25;
//        hart.info();

        System.out.println(makeString("Hart "));
    }
}
