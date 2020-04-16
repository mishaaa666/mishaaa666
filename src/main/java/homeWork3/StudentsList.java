package homeWork3;

import java.io.*;
import java.util.Scanner;

public class StudentsList {
    public static void main(String[] args) throws IOException {


         BufferedWriter bw = null;
         FileWriter fw = null;


        File file = new File("StudentsList.txt");
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input Last name, Name of students: ");
        String inputFio = in1.nextLine();

        System.out.println("Student: " + inputFio);


             fw = new FileWriter(file.getAbsoluteFile(), true);
             bw = new BufferedWriter(fw);


        readFile("StudentsList.txt", inputFio);

    }


    static void readFile(String fileName, String inputFio) {

        File file = new File("StudentsList.txt");
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String fio;
            boolean studentExist = false;
            while ((fio = reader.readLine()) != null) {
                if (fio.equals(inputFio)){
                studentExist = true;}
                //System.out.println(fio);
            }
            reader.close();
            if (studentExist) {
                System.out.println("Student already exists");
            } else {
                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);
                bw.write("\n" + inputFio);

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {


            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }
}

