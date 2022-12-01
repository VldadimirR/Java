// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package Homework_3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Zad_3 {
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

    // System.out.println(Collections.min(array));
    // System.out.println(Collections.max(array));

    int min = array.get(0);
    int max = array.get(0);;
    for (int i : array){
        if(i < min){
            min = i;
        }
        if (i > max){
            max = i;
        }
        }
    System.out.println("Максимальное число: " + max);
    System.out.println("Минимальное число: " + min);


    int sum = 0;
    if(!array.isEmpty()){
        for (int i: array){
            sum += i;
        }
    
    }
    double middle = (double)sum/array.size();
    System.out.println("Среднее арифметическое: " + middle);



    double min2 = array.get(0);
    double medium = middle;
    for (int i : array ){
        final double diff = Math.abs(i - medium);

        if(diff < min2){
            min2 = diff;
            medium = i;
        }
    }
    System.out.println("Среднее число: " + medium);
    }


    
    
}
