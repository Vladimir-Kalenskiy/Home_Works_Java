// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package HW5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

    Map<String, Integer> names = new HashMap<>();

    String [] nameArr = {
        "Иван Иванов",
        "Светлана Петрова",
        "Кристина Белова",
        "Анна Мусина",
        "Анна Крутова",
        "Иван Юрин",
        "Петр Лыков",
        "Павел Чернов",
        "Петр Чернышов",
        "Мария Федорова",
        "Марина Светлова",
        "Мария Савина",
        "Мария Рыкова",
        "Марина Лугова",
        "Анна Владимирова",
        "Иван Мечников",
        "Петр Петин",
        "Иван Ежов "
    };

    for (String el : nameArr) {
        String name = el.split(" ")[0];

        if(names.containsKey(name)) {
            names.replace(name, names.get(name) + 1);
        }
        else names.put(name, 1);
    }

    Map<String, Integer> sortMap = sortArr(names);
    
    System.out.println(names);
    System.out.println(sortMap);
}
    public static Map<String, Integer> sortArr (Map<String, Integer> map) {
        Map<String, Integer> sortArr = new LinkedHashMap<>();
        int max = 1;

        for (int  value : map.values()) {
            if(value > max) max = value;
        }

        for(int i = max; i > 0; i--) {
            for (var el : map.entrySet()) {
                if(map.get(el.getKey()) == i) {
                    sortArr.put(el.getKey(), el.getValue());
                }
            }
        }

        return sortArr;
    }
}