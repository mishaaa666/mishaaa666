package fourthLesson.inheritance.supExample;

public class Laptop extends Computer {

    String model;
    int size;

    public Laptop(String proc, int ram, int hdd, String model, int size){
        super(proc, ram, hdd);
        this.model = model;
        this.size = size;
    }

    void info(){
        System.out.println("Proc " +procName);
        System.out.println("Ram "+ ram);
        System.out.println("Hdd "+ hdd);
        System.out.println("Model " + model);
        System.out.println("Size " + size);
    }


}
