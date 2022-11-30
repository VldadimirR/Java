// К калькулятору из предыдущего дз добавить логирование.

package Homework_2;

import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Zad_2.class.getName());
        FileHandler fh = new FileHandler("Homework_2/log2.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setUseParentHandlers(false);

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scan.nextInt();
        logger.info("Пользователь ввел число: " + num1);

        System.out.print("Введите 2 число: ");
        int num2 = scan.nextInt();
        logger.info("Пользователь ввел число 2: " + num2);

        System.out.print("Введите действие: ");
        String num3 = scan.nextLine();
        num3 = scan.nextLine();
        logger.info("Пользователь ввел действие: " + num3);

        int res;

     switch (num3) {
         case "+":
             res = num1+ num2;
             System.out.println("Результат: "+ res);
             logger.info("Сложение = " +res );
             break;
         case "-":
             res = num1 - num2;
             System.out.println("Результат: "+ res);
             logger.info("Вычитание = " + res);
             break;
         case "/":
            if (num1 != 0 && num2 !=0){
                System.out.println("Результат: "+ (double)num1/num2);
                logger.info("Деление = " + (double)num1/num2);
                break;
            }
            else {
                System.out.println("На ноль делить нельзя");
                logger.info("Ошибка деления на ноль");
                break;
            }
         case "*":
             res = num1 * num2;
             System.out.println("Результат: "+ res);
             logger.info("Умножение = " + res);
             break;
         default:
             System.out.println("Ошибка!!!");
             logger.info("Ошибка");
         }
    }
}
