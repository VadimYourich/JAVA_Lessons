package seminar4;

// Реализовать консольное приложение, которое в цикле:
// Принимает от пользователя строку вида text~num
// Нужно разделить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку вида \"text~num\": ");
            String input = scanner.nextLine();
            if (input.equals("stop"))
                break;
            String[] parts = input.split("~");

            if (parts[0].equals("print")) {
                int position = Integer.parseInt(parts[1]);
                System.out.println(list.get(position));
                list.remove(position);
                continue;
            }
            list.add(Integer.parseInt(parts[1]), parts[0]);
            System.out.println(list);
        }
    }
}
