package hw4;

import java.util.LinkedList;
import java.util.List;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class task2 {
    static List<Integer> list = new LinkedList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            enqueue(i);
        }
        System.out.println("\nЗаданная очередь: \n" + list);
        System.out.println("\nУдалённый первый элемент: " + dequeue());
        System.out.println("\nСохранённый первый элемент: " + first());
        System.out.println("\nПолученная очередь: \n" + list + "\n");
    }
    public static void enqueue(int element){
        list.add(element);
    }
    public static int dequeue(){
        int temp = list.get(0);
        list.remove(0);
        return temp;
    }
    public static int first(){
        return list.get(0);
    }

}
