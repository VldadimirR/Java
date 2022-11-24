// Вывести все простые числа от 1 до 1000
package Homework_1;
import java.util.ArrayList;

public class Zad_2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < 1000; i++) {
        boolean Number = true;

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                Number = false;
                break; 
            }
        }

        if (Number) {
            list.add(i);
        }
    }
    System.out.println("Простые числа от 1 до 1000 " + list);
        }       
    }

