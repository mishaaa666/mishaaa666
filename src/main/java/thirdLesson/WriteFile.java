package thirdLesson;

import java.io.File;
import java.io.PrintWriter;

public class WriteFile {

    public static void main(String[] args) {
        File file = new File("example.txt");
        write("Next test\n", file);
    }

    static void write(String str, File file) {
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println(str);
            pw.close();
        } catch (Exception e) {

        }
    }
}
