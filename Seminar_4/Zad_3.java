//📔 Реализовать консольное приложение, которое:
//1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.

package Seminar_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Zad_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> dq = new ArrayDeque<>();

        while (true) {
            System.out.println("Введите строку");
            String str = sc.nextLine();
            if (str.equals("")) {
                break;
            } else if (str.equals("print")) {
                while (!dq.isEmpty()) {
                    System.out.println(dq.removeLast() + " ");
                }
            } else if (str.equals("revert")) {
                dq.removeLast();
            } else {
                dq.add(str);
            }
        }
        System.out.println(dq);
    }
}
