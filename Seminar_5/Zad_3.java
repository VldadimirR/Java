package Seminar_5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Zad_3 {
    public static void main(String[] args) {
        // SortMap();
        SortMap2();
    }

    public static void SortMap() {
        String s = "Мороз и солнце день чудесный Еще ты дремлешь, друг прелестный  Пора красавица проснись";
        TreeMap<Double, String> list = new TreeMap<>();
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        for (int i = 0; i < sMas.length; i++) {
            if (list.containsKey((double) sMas[i].length())) {
                list.put(sMas[i].length() + 0.01 * i, sMas[i]);
            } else
                list.put((double) sMas[i].length(), sMas[i]);
        }
        for (var el : list.entrySet()) {
            System.out.println(el.getKey() + " " + el.getValue() + "\n");

        }
    }
    public static void SortMap2(){
        String s = "Мороз и солнце день чудесный Еще ты дремлешь, друг прелестный Пора красавица проснись";
        TreeMap<Integer, List<String>> list = new TreeMap<>();
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        for (int i = 0; i < sMas.length; i++) {
            if(list.containsKey(sMas[i].length())){
                list.get(sMas[i].length()).add(sMas[i]);
            } else{
                ArrayList<String> lst = new ArrayList<>();
                lst.add(sMas[i]);
                list.put(sMas[i].length(), lst);
                
            }
        }
        
        for (var el : list.entrySet()) {
            System.out.println(el.getKey() + " " + el.getValue() + "\n");
        }

    }
}