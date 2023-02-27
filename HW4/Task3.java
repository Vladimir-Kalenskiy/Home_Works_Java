// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9
// Дополнительно каскадная отмена - отмена нескольких операций

package HW4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Double> results = new LinkedList<>();
        
        System.out.println("Введите первое число: ");
        results.add(sc.nextDouble());
        sc.nextLine();

        while(true) {
            System.out.print("Введите операцию (+, -, *, /, Cancel): ");
            String op = sc.nextLine();

            if ("".equals(op)) break;
            else if ("Cancel".equals(op) || "cancel".equals(op)) {
                results.removeFirst();

                if (results.size() == 0) results.add(0.0);
                }
            else {
                System.out.print("Введите второе число: ");
                double num2 = sc.nextDouble();

                calc(results, op, num2);
                sc.nextLine();
                }

            System.out.println("Результат: " + results.getFirst());
        }
        sc.close();
    }
    public static void calc(LinkedList<Double> list, String op, double num) {
        switch(op) {
            case "+": list.add(0, list.getFirst() + num);
                break;
            case "-": list.add(0, list.getFirst() - num);
                break;
            case "*": list.add(0, list.getFirst() * num);
                break;
            case "/": list.add(0, list.getFirst() / num);
                break;
            default:  System.out.printf("Error! Выберите правильно операцию (+,-,*,/,Cancel)");
        }
    }
}