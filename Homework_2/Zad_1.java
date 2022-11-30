//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package Homework_2;

import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Zad_1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Zad_1.class.getName());
        FileHandler fh = new FileHandler("Homework_2/log1.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setUseParentHandlers(false);
        
        System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 100));
            System.out.print(array[i] + " " );
        }
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            logger.info(Arrays.toString(array));
        
        }
        System.out.print("\n");
        System.out.println(Arrays.toString(array));
    }
}
