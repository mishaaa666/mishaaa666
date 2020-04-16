package fourthLesson.polimorphism;

public class SimplePol {

    public static void main(String[] args) {
        add(20);
        add("cat");
    }

    static void add(int i){
        System.out.println(" You add " +i);
    }

    static void add(String str){
        System.out.println("You add " + str);
    }

    static void add(String str, int digit){
        System.out.println("You add " + str + " and " + digit);
    }
}
