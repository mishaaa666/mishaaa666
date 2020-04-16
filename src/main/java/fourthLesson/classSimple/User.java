package fourthLesson.classSimple;

public class User {

    public String name;
    public int age;
    private boolean married;
    public static String city = "Kiev";


    public User(String name, int a, boolean b) {
        this.name = name;
        age = a;
        married = b;

    }

    public User(String name) {
        this.name = name;
    }
    //конструктор cmd+N


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    void info(){
        System.out.println("Name = "+ name +" " + "Age = "+ age + " Married = " + married + " City = "+ city);
    }

    void setMarried(boolean b){
        married = b;
    }

    static String makeString(String str){
        return str + "Hello";
    }

}

