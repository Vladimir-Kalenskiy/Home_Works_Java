// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
package HW3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            list1.add(random.nextInt(100));
            System.out.print(list1.get(i) + " ");
        }

        int sum = list1.get(0);
        int max = list1.get(0);
        int min = list1.get(0);

        for(int i = 1; i < list1.size(); i++) {
            sum += list1.get(i);
            if(max < list1.get(i)) max = list1.get(i);
            if(min > list1.get(i)) min = list1.get(i);
        }

        Float result = (float) sum / (list1.size());

        System.out.println();
        System.out.println("Minimal:" + min);
        System.out.println("Maximum: " + max);
        System.out.println("Arithmetic mean: " + result + "\n" + "Summa: " + sum + "\n" + "Size array: " + list1.size());
    }
}
