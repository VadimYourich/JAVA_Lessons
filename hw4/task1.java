package hw4;

import java.util.LinkedList;
import java.util.List;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class task1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println("Заданный список: \n" + list);
        System.out.println("\"перевернутый\" список: \n" + invertList(list));
    }

    private static List<Integer> invertList(List<Integer> list) {
        Integer temp;
        for (int i = 0; i < list.size()/2; i++) {
            temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }
        return list;
    }
}
