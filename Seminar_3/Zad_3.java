// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
//Вывести название каждой планеты и количество его повторений в списке. Удалить повторяющиеся элементы
package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zad_3 {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        ArrayList<String> result = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            result.add(planets[rnd.nextInt(0, planets.length)]);
        }
        System.out.println(result);
        Set<String> mySet = new HashSet<String>(result);
        System.out.println(mySet);
    //     for (String s : mySet) {
    //         System.out.println(s + " " + Collections.frequency(result, s));
    //     }
    //     Collections.sort(result);
    //     System.out.println(result);
    //     for (int i = 0; i < result.size() - 1; i++) {
    //         if (result.get(i) == result.get(i + 1)) {
    //             result.remove(result.get(i));i--;
    //         }
    //     }
    //     System.out.println(result);
    // }
    }
}
