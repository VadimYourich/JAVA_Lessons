package final_project;

import java.util.*;

public class Laptop {
    private int id;
    private String model;
    private String cpu;
    private int ram;
    private int ssd;
    private String os;
    private String color;
    private int price;

    public Laptop(int id, String model, String cpu, int ram, int ssd, String os, String color, int price) {
        this.id = id;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("id: %d   model: %s   cpu: %s   ram: %d   ssd: %d   os: %s   color: %s   price: %d",
         id, model, cpu, ram, ssd, os, color, price);
    }

    public int getID() {return id;}
    public String getModel() {return model;}
    public String getCPU() {return cpu;}
    public int getRAM() {return ram;}
    public int getSSD() {return ssd;}
    public String getOS() {return os;}
    public String getColor() {return color;}
    public int getPrice() {return price;}

    public Laptop(){}

    public Scanner input = new Scanner(System.in);

    public Set<Laptop> filterLaptop(Set<Laptop> laptop) {
        HashMap<String, String> filter = new HashMap<>();
        Set<Laptop> resultLaptop = new HashSet<>(laptop);
        
        System.out.println("\nКритерии фильтрации: 1 - цена, 2 - объём RAM, 3 - объём SSD, 4 - операционная система, 5 - цвет.");
        System.out.println("Введите цифры, соответствующие необходимому критерию, через пробел: ");
        String[] num = input.nextLine().split(" ");

        for (int i = 0; i < num.length; i++) {
            if (num[i].equals("1")) {
                System.out.println("Введите максимальную цену (от 25000 до 70000): ");
                String pr = input.nextLine();
                filter.put("price", pr);
                
            } else if (num[i].equals("2")) {
                System.out.println("Введите минимальный объём ОЗУ (доступны - 4, 6, 8, 16): ");
                String rm = input.nextLine();
                filter.put("ram", rm);
                
            } else if (num[i].equals("3")) {
                System.out.println("Введите минимальный объём SSD (доступны - 60, 128, 240, 320, 512, 850): ");
                String ss = input.nextLine();
                filter.put("ssd", ss);
                
            } else if (num[i].equals("4")) {
                System.out.println("Введите операционную систему (доступны - Windows, MacOS или Linux): ");
                String ops = input.nextLine();
                filter.put("os", ops);

            } else if (num[i].equals("5")) {
                System.out.println("Введите цвет (доступны - gray, red, black, white): ");
                String cl = input.nextLine();
                filter.put("color", cl);

            } else {
                System.out.println("Такое значение для фильтрации не применяется!");
            }
        }

        for (String key : filter.keySet()) {
            for (Laptop elem : laptop) {
                if (key == "price" && elem.price > Integer.valueOf(filter.get("price"))) {
                    resultLaptop.remove(elem);
                } else if (key == "ram" && elem.ram > Integer.valueOf(filter.get("ram"))) {
                    resultLaptop.remove(elem);
                } else if (key == "ssd" && elem.ssd > Integer.valueOf(filter.get("ssd"))) { 
                    resultLaptop.remove(elem);
                } else if (key == "os" && !elem.os.equals(filter.get("os"))) {
                    resultLaptop.remove(elem);
                } else if (key == "color" && !elem.color.equals(filter.get("color"))) {
                    resultLaptop.remove(elem);
                }
            }
        }
        return resultLaptop;
    }

    public void printLaptop(Set<Laptop> laptop) {
        System.out.println("\nСписок ноутбуков по выбранным критериям:\n");
        for (Laptop elem : laptop) {
            System.out.println(elem);
        }
    }
}
