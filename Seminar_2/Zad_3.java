// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package Seminar_2;

import java.io.FileWriter;
import java.io.IOException;

public class Zad_3 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("Seminar_2/file.txt", true)){
            String txt = "TEST";
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                str.append(txt);
            }
            fw.write(String.valueOf(str));
            fw.flush();

        }
        catch(IOException ex){
            System.out.println(ex);
        }
        
    }
}
