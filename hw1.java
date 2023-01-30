// Написать программу вычисления n-го треугольного числа.
// T(n) = 1/2 * n * (n + 1) - формула для n-го треугольного числа.

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        System.out.println("Программа вычисления N-го треугольного числа.");
        int number = getNumberFromUser();
        int natural = checkingForNaturalness(number);
        int result = triangularNumber(natural);
        System.out.println(printResult(result));
    }

    // Ввод числа N
    static int getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nВведите натуральное число для N-го треугольного числа: ");
        if (input.hasNextInt()) {
            return input.nextInt();
        } else {
            System.out.println("Извините, но это явно не натуральное число. Перезапустите программу и попробуйте снова!");
            System.exit (1);
            return 0;
        }
    }

    // Проверка числа на натуральность
    static int checkingForNaturalness(int num) {
        if (num > 0) {
            return (num);
        } else {
            System.out.println("Извините, но это не натуральное число. Перезапустите программу и попробуйте снова!");
            System.exit (1);
            return 0;
        }
    }

    // Вычисление N-го треугольного числа
    static int triangularNumber(int num) {
        return (num * (num + 1)) / 2;
    }

    // Печать результата
    static String printResult(int res) {
        String output = " Треугольное число: ";
        return String.format("%s %d\n", output, res);
    }
}
