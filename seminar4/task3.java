package seminar4;

import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк и 
// выводит содержимое стэка, доставая его содержимое по одному.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь 
// и выводит на консоль содержимое очереди, доставая её содержимое по одному.

public class task3 {
    public static void main(String[] args) {
        fillPrintStack(new int[] { 2, 6, 2, 9, 6 });
    }

    private static void fillPrintStack(int[] itemNumbers) {
        Stack<Integer> stackNumber = new Stack<Integer>();

        for (int num : itemNumbers) {
            stackNumber.push(num);
        }

        while (!stackNumber.isEmpty()) {
            System.out.println(stackNumber.pop());
        }

    }
}