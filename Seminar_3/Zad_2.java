// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zad_2 {
    public static void main(String[] args) {
        String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        ArrayList<String> result = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            result.add(planets[rnd.nextInt(planets.length - 1)]);
        }
        System.out.println(result);
        Set<String> mySet = new HashSet<String>(result);
        for(String s: mySet){
            System.out.println(s + " " + Collections.frequency(result,s));
        }
    }
}
