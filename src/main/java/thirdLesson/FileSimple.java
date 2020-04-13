package thirdLesson;

import java.io.File;
import java.io.IOException;

public class FileSimple {

    public static void main(String[] args) {
        File file = new File("example.txt");
        System.out.println(file.exists());
        if (!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        //file.mkdir();
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
    }
}
