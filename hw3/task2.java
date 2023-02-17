// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package hw3;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;


public class task2 {
    public static void main(String[] args) {
        List<Integer> list = generateList(10, 0, 100);
        System.out.println("Исходный список:\n" + list);
        list.removeIf(el -> el % 2 == 0);
        System.out.println("Список нечётных чисел исходного списка:\n" + list);
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
