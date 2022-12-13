package Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<>();
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите паспорт и фамилию через пробел");
            String s = iScanner.nextLine();
            String[] sMas = s.split(" ");
            list.put(Integer.parseInt(sMas[0]), sMas[1]);
        }
        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
        System.out.println();
        for (var el : list.entrySet()) {
            if (el.getValue().equals("Иванов"))
                ;
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
        iScanner.close();

    }
}
