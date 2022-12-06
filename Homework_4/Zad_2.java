// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
package Homework_4;

import java.util.LinkedList;

public class Zad_2 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            lst.add(i);
        }
        System.out.println("Очередь: ");
        System.out.println(lst);

        enqueue(lst, 666);
        System.out.println("\nПоместил число в конец очереди: ");
        System.out.println(lst);

        dequeue(lst);
        System.out.println("\nВернул первый элемент из очереди и удалил его: ");
        System.out.println(lst);

        first(lst);
        System.out.print("\nПервый элемент из очереди: ");
        System.out.print(first(lst));
    }

    public static void enqueue(LinkedList<Integer> lst, int number) {
        lst.add(number);
    }

    public static void dequeue(LinkedList<Integer> lst) {
        lst.pollFirst();
    }

    public static int first(LinkedList<Integer> lst) {
        return lst.getFirst();
    }
}
