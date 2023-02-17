// Реализовать алгоритм сортировки слиянием.

package hw3;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] array = createArray(10, 0, 100);
        System.out.println("Исходный массив: \n" + Arrays.toString(array));
        System.out.println("Отсортированный массив: \n" + Arrays.toString(mergeSort(array)));
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

    // сортировка слиянием

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, left.length, arr.length);
    
        return merge(mergeSort(left), mergeSort(right));
    }
        private static int[] merge(int[] left, int[] right) {
    
            int[] result = new int[left.length + right.length];
    
            int resIn = 0, leftIn = 0, rightIn = 0;
    
            while (leftIn < left.length && rightIn < right.length)
                if (left[leftIn] < right[rightIn])
                    result[resIn++] = left[leftIn++];
                else result[resIn++] = right[rightIn++];
    
            while (resIn < result.length)
                if (leftIn != left.length)
                    result[resIn++] = left[leftIn++];
                else result[resIn++] = right[rightIn++];
    
            return result;
        }
    }
