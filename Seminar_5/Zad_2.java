package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Zad_2 {
    public static void main(String[] args) {
        System.out.println(IsIzomoph("paper", "timle"));
    }

    public static boolean IsIzomoph(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return true;
        Map<Character, Character> subWord = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if (subWord.containsKey(a) && b != subWord.get(a))
                return false;
            else
                subWord.put(a, b);
        }
        return true;
    }
}
