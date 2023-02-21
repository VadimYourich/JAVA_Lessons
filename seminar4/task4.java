package seminar4;

import java.util.Arrays;

/**
 * Реализовать стэк с помощью массива. Нужно реализовать методы:
 * size(), empty(), push(), peek(), pop().
 */

public class task4 {
    public static int[] array;

    public static void main(String[] args) {
        array = new int[0];

        push(2);
        push(3);
        push(4);

        System.out.println(Arrays.toString(array));

        while (!empty())
            System.out.println(pop());
    }

    private static void push(int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        newArray[array.length] = element;
        array = newArray;
    }

    private static int pop() {
        if (array.length == 0) // массив пуст. извлекать элемент нельзя
            throw new IllegalStateException("Нельзя доставать элементы из пустого стэка");
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++)
            newArray[i] = array[i];
        int result = array[array.length - 1];
        array = newArray;
        return result;
    }

    private static int peek () { return array[array.length - 1]; }

    private static int size () { return array.length; }

    private static boolean empty () { return array.length == 0; }

}