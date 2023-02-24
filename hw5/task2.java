package hw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена 
// с количеством повторений. Отсортировать по убыванию популярности.

public class task2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Map<String, Integer> nameCounts = new HashMap<>();

        nameList.add("Иван");
        nameList.add("Пётр");
        nameList.add("Антон");
        nameList.add("Пётр");
        nameList.add("Иван");
        nameList.add("Тимур");
        nameList.add("Иван");
        nameList.add("Максим");
        nameList.add("Пётр");
        nameList.add("Кирилл");
        nameList.add("Кирилл");
        nameList.add("Иван");

        for (String name : nameList) {
            int count = nameCounts.getOrDefault(name, 0);
            nameCounts.put(name, ++count);
        }

        List<Map.Entry<String, Integer>> result = nameCounts.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList();

        for (Map.Entry<String, Integer> e : result)
            System.out.println(e);
    }
}
