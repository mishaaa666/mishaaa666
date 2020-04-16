package fourthLesson.inheritance.supExample;

import java.util.ArrayList;
import java.util.List;

public class ExecuteSup {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop("AMD", 16, 256, "sr-33", 14);
        lenovo.info();
        PersonalComputer pentium = new PersonalComputer("Intel", 8, 1024, "LG", "Samsung");
        pentium.info();

        List<Computer> list = new ArrayList<>();
        list.add(lenovo);
        list.add(pentium);

        for (Computer c : list) {
            c.info();
            System.out.println("__________________");
        }
    }
}
