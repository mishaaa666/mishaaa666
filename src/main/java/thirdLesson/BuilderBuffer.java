package thirdLesson;

public class BuilderBuffer {

    public static void main(String[] args) {
//        String str = "P";
//
//        System.out.println(str + "R");
//
//        str = new String(str + "R");


        StringBuffer bf = new StringBuffer();
        bf.append("Hello ");
        System.out.println(bf);
        bf.append("STUDENT ");
        System.out.println(bf);
        System.out.println(bf.replace(0, 5, "HI"));
    }
}
