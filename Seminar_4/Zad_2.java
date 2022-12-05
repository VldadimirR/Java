
//📔 Реализовать консольное приложение, которое:
//1. Принимает от пользователя строку вида
//text~num
//1. Нужно расспилить строку по ~, сохранить text в связный список на позицию num.
//2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = sc.nextLine();

        LinkedList<String> linkl = new LinkedList<>();
        String[] arr = str.split("~");

        int ind = Integer.parseInt(arr[1]);
        for (int i = 0; i < ind * 2; i++) {
            linkl.add("Строка" + i);
        }

        if (arr[0].equals("print")) {
            System.out.println(linkl.remove(ind));
        } else {
            linkl.add(ind, arr[0]);
        }

        System.out.println(linkl);

    }
}
