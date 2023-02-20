// Пусть дан произвольный список целых чисел, удалить из него четные числа
package HW3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            list1.add(random.nextInt(100));
            System.out.print(list1.get(i) + " ");
        }

        System.out.println();

        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i)%2 == 0) {
                list1.remove(i);
                i--;
            }
        }

        for(int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
    }
}
