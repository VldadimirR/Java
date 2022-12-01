// Пусть дан произвольный список целых чисел, удалить из него четные числа
package Homework_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args) {


        System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rnd = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(rnd.nextInt(100));
        }
        System.out.println(array);

        Iterator<Integer> arrayIter = array.iterator();
        while(arrayIter.hasNext()){
            int nextInt = arrayIter.next();
            if (nextInt % 2 == 0){
                arrayIter.remove();
            }
        
        }
        System.out.println(array);
    }
}