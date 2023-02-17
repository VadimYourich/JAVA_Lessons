// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatCount {
    public static void main(String[] args) {
        List<String> planets = Arrays.asList("Марс", "Юпитер", "Марс", "Сатурн", "Венера", "Юпитер",
                "Марс", "Сатурн");
        List<String> planetNames = new ArrayList<>();
        List<Integer> planetCounts = new ArrayList<>();

        for (String planet : planets) {
            if (!planetNames.contains(planet)) {
                planetNames.add(planet);
                planetCounts.add(1);
            } else {
                int index = planetNames.indexOf(planet);
                planetCounts.set(index, planetCounts.get(index) + 1);
            }
        }
        for (int i = 0; i < planetNames.size(); i++) {
            System.out.printf("%s - %d\n", planetNames.get(i), planetCounts.get(i));
        }
    }
}