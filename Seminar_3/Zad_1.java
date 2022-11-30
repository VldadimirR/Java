// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Zad_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        // ArrayList<Integer> array = new ArrayList<>(Arrays.asList(4,5,78,5,67,3,4,56,23));
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArray.add(rnd.nextInt(100));
        }
        System.out.println(intArray);
        // printArray(intArray);
        Collections.sort(intArray);
        // printArray(intArray);
        System.out.println(intArray);
    }
    public static void printArray(ArrayList<Integer> array){
        StringBuilder print = new StringBuilder();
        for (Integer number:array){
            print.append(number + ", ");
        }
        String output = print.substring(0, print.length() - 2);
        System.out.println(output);
    }
}
