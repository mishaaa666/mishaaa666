package homeWork2;

import java.util.Scanner;

public class SymbolBNumbers {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input phrase: ");
        String  phrase = in1.nextLine();
        System.out.println("Phrase: " + phrase);

        char [] text = phrase.toCharArray();

        char str = 'b';

        int count = 0;
        for (int i = 0; i < text.length; i++){
            if (text[i] == str){
                count++;
            }

        }
        System.out.println("Numbers of B-symbols: " + count);

        in1.close();
    }
}
