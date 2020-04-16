package fourthLesson.abstractSimple;

public class ImplementAbstract extends AbstractMain {
    @Override
    String gerStr(int digit) {
        return Integer.toString(digit);
    }

    @Override
    void info() {
        System.out.println("Some info");

    }
}
