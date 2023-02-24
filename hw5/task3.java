package hw5;

import java.util.Arrays;
import java.util.Random;

// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class task3 {
    public static void main(String[] args) {
        int[] arr = createArray(20, 0, 100);
        System.out.println("Исходный массив: \n" + Arrays.toString(arr));

        HeapSort(arr);
        System.out.println("Отсортированный массив: \n" + Arrays.toString(arr));
    }

    // Сортируем массив методом HeapSort
   
    public static void HeapSort(int[] arr) {
        int size = arr.length;
        int temp;

        for (int i = size / 2 - 1; i >= 0; i--) {
            sortingTree(arr, size, i);
        }

        for (int i = size - 1; i >= 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            sortingTree(arr, i, 0);
        }
    }

    // приводим массив к состоянию сортирующего дерева
     
    private static void sortingTree(int[] arr, int size, int i) {
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            sortingTree(arr, size, largest);
        }
    }

    // создание массива случайных чисел

    static int[] createArray(int size, int down, int up) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(down, up);
        }
        return arr;
    }
}
