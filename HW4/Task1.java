
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package HW4;

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        rand(list1);
        System.out.println(list1.toString());
        System.out.println();
        LinkedList<Integer> newList1 =  ReverseList(list1);
        System.out.println(newList1.toString());
    }
    public static void rand (LinkedList list) {
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(10));
        }
    }
    public static LinkedList<Integer> ReverseList(LinkedList<Integer> list) {
        LinkedList<Integer> newList1 = new LinkedList<>();

        for(int i = list.size(); i > 0 ; i--) {
            newList1.add(list.get(i-1));
        }
        return newList1;
    }
}