package thirdLesson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        readFile("example.txt");
    }

    static void readFile(String fileName) {
        File file = new File(fileName);
        try(BufferedReader reader = new BufferedReader(new FileReader(file));) {
            //FileReader fReader = new FileReader(file);
            //BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //reader.close();
        } catch (Exception e) {

        }
    }
}