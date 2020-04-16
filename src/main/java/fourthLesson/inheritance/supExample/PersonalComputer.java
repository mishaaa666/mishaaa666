package fourthLesson.inheritance.supExample;

public class PersonalComputer extends Computer {

    String monitor;
    String keyboard;

    public PersonalComputer(String procName, int ram, int hdd, String monitor, String keyboard){
        super(procName, ram, hdd);
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    void info() {
        System.out.println("Proc " +procName);
        System.out.println("Ram "+ ram);
        System.out.println("Hdd "+ hdd);
        System.out.println("Monitor "+monitor);
        System.out.println("Keyboard "+keyboard);
    }
}
