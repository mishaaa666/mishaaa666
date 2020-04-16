package fourthLesson.inheritance;

public class ExecuteInher {
    public static void main(String[] args) {
       // SupSimple superClass = new SupSimple();
        SupSimple superClass = new SubSimple();

        SubSimple subClass = new SubSimple();

        superClass.a = 10;
        superClass.b = 5;



        superClass.info();



        subClass.a = 9;
        subClass.b = 1;
        subClass.c = 2;

        subClass.info();
        subClass.sum();


    }
}
