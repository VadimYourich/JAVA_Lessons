package final_project;

/*
 * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * 2. Создать множество ноутбуков.
 * 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 *    фильтрации и выведет ноутбуки, отвечающие фильтру.
 *    Критерии фильтрации можно хранить в Map. Например:
 *    “Введите цифру, соответствующую необходимому критерию:
 *     1 - ОЗУ
 *     2 - Объем ЖД
 *     3 - Операционная система
 *     4 - Цвет …
 * 4. Далее нужно запросить минимальные значения для указанных критериев - 
 *    сохранить параметры фильтрации можно также в Map.
 * 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop num1 = new Laptop(1, "SAMSUNG", "Intel", 4,
         640, "Windows", "black", 29000);
        Laptop num2 = new Laptop(2, "HP", "AMD", 4,
         60, "Linux", "gray", 24000);
        Laptop num3 = new Laptop(3, "MSI", "AMD", 4,
         240, "Linux", "white", 28000);
        Laptop num4 = new Laptop(4, "ASUS", "AMD", 4,
         240, "Linux", "gray", 25500);
        Laptop num5 = new Laptop(5, "DELL", "Intel", 6,
         320, "Windows", "red", 32000);
        Laptop num6 = new Laptop(6, "MSI", "Intel", 6,
         240, "Windows", "black", 30000);
        Laptop num7 = new Laptop(7, "MSI", "AMD", 8,
         512, "Linux", "gray", 38000);
        Laptop num8 = new Laptop(8, "ASUS", "Intel", 8,
         512, "Windows", "white", 40000);
        Laptop num9 = new Laptop(9, "MSI", "AMD", 8,
         240, "Linux", "gray", 28000);
        Laptop num10 = new Laptop(10, "MAKBOOK", "Intel", 16,
         850, "MacOS", "red", 70000);

        Set<Laptop> laptop = new HashSet<>();
        laptop.add(num1);
        laptop.add(num2);
        laptop.add(num3);
        laptop.add(num4);
        laptop.add(num5);
        laptop.add(num6);
        laptop.add(num7);
        laptop.add(num8);
        laptop.add(num9);
        laptop.add(num10);
        
        Laptop resultLaptop = new Laptop();

        System.out.println("\n    Программа выбора ноутбуков по критериям.");
        resultLaptop.printLaptop(resultLaptop.filterLaptop(laptop));
    }
}