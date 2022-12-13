package Seminar_6;
//1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. 
//Поместите в него некоторое количество объектов.
//2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. 
//Убедитесь, что все они сохранились во множество.
//3. Создайте метод public boolean equals(Object o)
//Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. 
//То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
//4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        cat1.invite();
        cat1.setAge(10);
        cat1.setPassport(12312312);

        Cat cat2 = new Cat("Vaska");
        Cat cat3 = new Cat("Vaska");

       
        
        Set<Cat> cats = new HashSet<>();
        cats.add(cat3);
        cats.add(cat2);

        System.out.println(cats);
        System.out.println(cat2.equals(cat3));
    }
}
