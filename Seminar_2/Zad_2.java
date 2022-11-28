// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
package Seminar_2;

public class Zad_2{
    public static void main(String[] args){

        String w = "шалаш";
        if(polindrom(w)) System.out.printf("Слово %s - является полиндромом", w);
        else System.out.printf("Слово %s - не является полиндромом", w);
    }
    public static boolean polindrom(String word){
        String str = word;
        String[] array = str.split("");
        for (int i = 0; i< array.length; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i] ;
            array[array.length - 1 - i] = temp;
        }
        str = String.join("", array);
        if (str.equals(word)) return true;
        return false;
    }
    public static void print(String str){
        System.out.println(str);
    }
}

//Вариант 2
// public class app2 {
//     public static void main(String[] args) {
//     String chars="00c0c00";
//     int counter=0;
//     for (int i = 0; i < chars.length()/2; i++)
//     if(chars.charAt(i)==chars.charAt(chars.length()-i-1))
//     counter++;
    
//     System.out.println(chars);
//     if(counter>=(chars.length()/2))
//     System.out.println("полиндром");
//     else System.out.println("не полиндром");
//     }}