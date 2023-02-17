package seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести 
// его на экран.

public class task1 {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(0, 100));
        }
        randomNumbers.sort(null);
        System.out.println(randomNumbers);
    } 
}
