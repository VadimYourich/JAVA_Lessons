package seminar5;

import java.util.*;

/*
оздать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
*/

public class task1 {
    public static void main(String[] args) {
        Map<Integer, String> passportToName = new HashMap<>();
        passportToName.put(123456, "Иванов");
        passportToName.put(321456, "Васильев");
        passportToName.put(234561, "Петрова");
        passportToName.put(234432, "Иванов");
        passportToName.put(654321, "Петрова");
        passportToName.put(345678, "Иванов");

        System.out.println(passportToName);

        for (Map.Entry<Integer, String> pair : passportToName.entrySet()) {
            if (pair.getValue().equals("Иванов"))
                System.out.format("%d %s\n", pair.getKey(), pair.getValue());
        }
    }
}