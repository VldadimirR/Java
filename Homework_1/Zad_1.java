//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homework_1;

import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args){
        System.out.print("Введите число: ");
        Scanner iScan = new Scanner(System.in);
        int number = iScan.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;                     
        }
        System.out.printf("Факториал числа: " + number + " = " + factorial + "\n");


        int triangular = 0;
        for (int i = 1; i <= number; i++) {
            triangular += i;                     
        }
        System.out.println("Треугольное число: " + number + " = " + triangular);
        }
    }

