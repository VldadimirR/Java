//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности
package Homework_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Zad_2 {
    public static void main(String[] args) {
        String[] lst = { "Ivanov Ivan", "Smirnov Ivan", "Kuznecov Ivan", "Popov Petr", "Lebedev Petr", "Kozlov Vova" };
        ArrayList<String> name = new ArrayList<>();
        TreeMap<Integer, String> result = new TreeMap<>(Collections.reverseOrder());

        for (String s : lst) {
            String[] sMas = s.split(" ");
            name.add(sMas[1]);
        }

        Set<String> unique = new HashSet<>(name);
        for (String key : unique) {
            result.put(Collections.frequency(name, key), key);
        }

        for (var el : result.entrySet()) {
            System.out.print(el.getKey() + ":" + el.getValue() + "\n");
        }

    }
}
