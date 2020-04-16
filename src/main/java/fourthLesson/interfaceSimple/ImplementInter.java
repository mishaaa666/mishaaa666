package fourthLesson.interfaceSimple;

public class ImplementInter implements IShowInterface{

    String str;


    @Override
    public void check(String str) {

    }

    @Override
    public void show() {

    }

    @Override
    public String getName() {
        return str;
    }
}
