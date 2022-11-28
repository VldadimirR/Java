// Напишите метод, который вернет содержимое текущей папки в виде массива строк. Напишите метод, который запишет массив,
//возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

package Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Zad_4 {
    public static void main(String[] args) {
        String path = "C:\\Users\\rasal\\OneDrive\\Desktop\\Java\\Seminar_22";
        print(getFolderContent(path));
        writerFolderContent(getFolderContent(path));
        
    }
    public static ArrayList<String> getFolderContent(String path) {
        ArrayList<String> array = new ArrayList<>();
        try { 
            File f1 = new File(path);
            for (File file: f1.listFiles()){
            array.add(file.getName());
        }
        return array;
    } catch (Exception e) {
        logger("Ошибка");
        System.out.println("Ошибка");
        array.add("Ошибка");
        return array;
    }
        }
    public static void print(ArrayList<String> array) {
        for (String i: array){
            System.out.println(i);
    }
    }
    public static void writerFolderContent(ArrayList<String> array){
        try { 
            FileWriter fw = new FileWriter("Seminar_2/content.txt", true);
            for (String file: array){
                fw.write(file);
                fw.append("\n");
        }
        fw.flush();
        } catch (Exception e) {
            logger("Ошибка");
            System.out.println("Ошибка");
        }
    }
    public static void logger(String text){
        try{
            FileWriter log = new FileWriter("Seminar_2/log.txt", true);
            log.write(LocalDateTime.now() + " " + text + "\n");
            log.flush();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
