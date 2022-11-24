// Реализовать простой калькулятор
package Homework_1;

import java.util.Scanner;

public class Zad_3{

     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.print("Введите 1 число: ");
         int num1 = scan.nextInt();
 
         System.out.print("Введите 2 число: ");
         int num2 = scan.nextInt();
 
         System.out.print("Введите действие: ");
         String num3 = scan.nextLine();
         num3 = scan.nextLine();
 
         int res;
 
      switch (num3) {
          case "+":
              res = num1+ num2;
              System.out.println("Результат: "+ res);
              break;
          case "-":
              res = num1 - num2;
              System.out.println("Результат: "+ res);
              break;
          case "/":
              res = num1 / num2;
              System.out.println("Результат: "+ res);
              break;
          case "*":
              res = num1 * num2;
              System.out.println("Результат: "+ res);
              break;
          default:
              System.out.println("Ошибка!!!");
          }
     }
}
 