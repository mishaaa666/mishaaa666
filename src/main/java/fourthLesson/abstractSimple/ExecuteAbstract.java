package fourthLesson.abstractSimple;

public class ExecuteAbstract {

    public static void main(String[] args) {

        ImplementAbstract implementAbstract = new ImplementAbstract();

        AbstractMain abstractMain = new ImplementAbstract();

        abstractMain.info();

        String result = implementAbstract.gerStr(2);

        System.out.println(result);
    }
}
