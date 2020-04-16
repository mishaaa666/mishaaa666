package fourthLesson.inheritance.supExample;

public class Computer {

    String procName;
    int ram;
    int hdd;

    public Computer(String procName, int ram, int hdd) {
        this.procName = procName;
        this.ram = ram;
        this.hdd = hdd;
    }

    void info(){
        System.out.println("Proc " +procName);
        System.out.println("Ram "+ ram);
        System.out.println("Hdd "+ hdd);
    }
}
