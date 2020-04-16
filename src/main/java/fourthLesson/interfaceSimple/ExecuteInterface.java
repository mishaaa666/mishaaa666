package fourthLesson.interfaceSimple;

public class ExecuteInterface {

    public static void main(String[] args) {
        ImplementInter implementInter = new ImplementInter();

        implementInter.str = "Interface";

        implementInter.check("");

        System.out.println(implementInter.getName());
    }
}
