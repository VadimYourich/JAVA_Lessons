package hw2;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 */

 import java.io.IOException;
 import java.util.Arrays;
 import java.util.Random;
 import java.util.Scanner;
 import java.util.logging.FileHandler;
 import java.util.logging.Logger;
 import java.util.logging.SimpleFormatter;

public class task2 {
    public static void main(String[] args){
        int size = getNumberByUser("Задайте размер числового массива: ");
        int min = getNumberByUser("Введите минимальное значение элементов массива: ");
        int max = getNumberByUser("Введите максимальное значение элементов массива: ");
        sortByBubbleWithLogger(fillNumArrRandom(size, min, max));
    }

    // Получение числа от пользолвателя
    static int getNumberByUser(String text){ 
        Scanner input = new Scanner(System.in);
        System.out.print(text);
        return input.nextInt();
    }

    // Заполнение числового массива
    static int[] fillNumArrRandom(int size, int min, int max) { 
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(min, max+1);
        }
        return arr;
    }

    // Логирование
    static void myLog(String res) {      
        Logger logger = Logger.getLogger(task2.class.getName());
        try {
            FileHandler fh = new FileHandler("hw2/log.txt", true);
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info(res);
            fh.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Сортировка массива пузырьком с логированием
    static void sortByBubbleWithLogger(int[] numArr){ 
        myLog("Source array: " + Arrays.toString(numArr));
        int count = 1;
        for (int i = 1; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length-i; j++) {
                if (numArr[j] > numArr [j+1]){
                    int temp = numArr [j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    myLog("ITERATION № " + count + "    ==>    " + Arrays.toString(numArr));
                    count++;
                }
            }
        }
        myLog("SORTED ARRAY: " + Arrays.toString(numArr));
    }
}