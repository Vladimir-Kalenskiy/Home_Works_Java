// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package HW4;

import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        
        randAdd(list1);
        System.out.println(list1);

        enqueue(list1, 99);
        System.out.println(list1);

        dequeue(list1);
        System.out.println(list1);

        int num = first(list1);
        System.out.println(num);
        System.out.println(list1);
    }
    public static void enqueue(LinkedList<Integer> list, Integer num) {
        list.add(num);
    }
    public static int dequeue(LinkedList<Integer> list) {
        return list.remove();
    }
    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }
    public static void randAdd (LinkedList<Integer> list) {
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(10));
        }
    }
}
