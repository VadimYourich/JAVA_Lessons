// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое этого списка.

package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        List<Integer> list = generateList(10, 0, 100);
        System.out.println("Исходный Список:\n" + list);
        System.out.println("минимальное = " + Collections.min(list));
        System.out.println("максимальное = " + Collections.max(list));
        System.out.println("среднее арифметичское = " + list.stream() .mapToInt(a -> a).average().orElse(0));
    }

    // создание списка случайных чисел

    static ArrayList<Integer> generateList(int size, int down, int up) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(down, up));
        }
        return list;
    }
}
