// Реализуйте структуру телефонный книги с помощью HashMap, учитывая что 1 человек может иметь несколько телефонов
package Homework_5;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args) {
        HashMap<String, List<String>> lst = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите + что бы вывести весь справочник");
        System.out.println("Введите - что бы вывести номер/номера одного человека");
        String a = sc.nextLine();

        lst.put("Ivanov", List.of("+1111111111"));
        lst.put("Petrov", List.of("+3333333333", "+44444444444"));
        lst.put("Semenov", List.of("+555555555", "+66666666666", "+7777777777"));

        switch (a) {
            case "+":
                System.out.println(lst);
                break;
            case "-":
                System.out.println("Введите фамилию");
                String b = sc.nextLine();
                System.out.println(lst.get(b));
                break;
            default:
                System.out.println("Ошибка");

        }
    }
}
