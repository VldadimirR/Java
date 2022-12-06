//Написать программу, определяющую правильность расстановки скобок в выражении.
//        (a+(d*3)) - истина
//        [a+(1*3) - ложь
//        [6+(3*3)] - истина
//        {a}[+]{(d*3)} - истина
//        <{a}+{(d*3)}> - истина
//        {a+]}{(d*3)} - ложь
package Homework_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Zad_3 {
    public static void main(String[] args) {
        String expr = "{a+]}{(d*3)}";

        if (brackets(expr))
            System.out.println("Истина");
        else
            System.out.println("Ложь");
    }

    static boolean brackets(String expr) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{' || x == '<') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[' || check == '<')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[' || check == '<')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(' || check == '<')
                        return false;
                    break;
                case '>':
                    check = stack.pop();
                    if (check == '{' || check == '[' || check == '(')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
