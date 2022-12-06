//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package Homework_4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Zad_1 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            lst.add(rnd.nextInt(100));
        }
        System.out.println(lst);
        System.out.println(printReversArray(lst));
    }

    private static String printReversArray(LinkedList<Integer> array) {
        ListIterator<Integer> lstIter = array.listIterator(array.size());
        StringBuilder print = new StringBuilder();
        print.append("[");
        while (lstIter.hasPrevious()) {
            if (lstIter.hasNext()) {
                print.append(", ");
            }
            print.append(lstIter.previous());
        }
        print.append("]");
        return print.toString();
    }
}
