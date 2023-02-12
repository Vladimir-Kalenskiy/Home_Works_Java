// Реализовать простой калькулятор (+ - / *)

package HW1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char op;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = sc.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = sc.nextDouble();
        System.out.print("\nВыберите операцию (+, -, *, /): ");
        op = sc.next().charAt(0);
        sc.close();

        switch(op) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:  System.out.printf("Error! Выберите правильно операцию (+,-,*,/)");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + result);
   }
}