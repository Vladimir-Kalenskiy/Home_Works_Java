// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
package HW1;

import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число n: ");
            int n = sc.nextInt();
            sc.close();

            int sumN = 0;
            int factN = 1;

            for(int i = 1; i <= n; i++) {
                sumN += i;
                factN *= i;
            }
            System.out.printf("Треугольное число %d = %d\nФакториал числа %d = %d", n, sumN, n, factN);
        }
    }