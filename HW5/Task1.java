// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 
// 1) Добавление номера
// 2) Вывод всего

package HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 111111, bookPhone);
        addNumber("Petrov", 222222, bookPhone);
        addNumber("Ivanov", 333333, bookPhone);
        addNumber("Petrov", 444444, bookPhone);
        addNumber("Ivanov", 555555, bookPhone);
        addNumber("Sidorov", 123456, bookPhone);
        printBook(bookPhone);

    }
    public static void addNumber(String key, int num, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(num);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(num);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + " ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
