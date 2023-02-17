// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package seminar3;

import java.util.ArrayList;
import java.util.List;

public class FindAndDeleteNumber {
public static void main(String[] args) {
List stringsAndNumbers = new ArrayList<String>();
stringsAndNumbers.add("Москва");
stringsAndNumbers.add(125);
stringsAndNumbers.add(125);
stringsAndNumbers.add(125);
stringsAndNumbers.add(125);
stringsAndNumbers.add("Казань");
stringsAndNumbers.add(145);
stringsAndNumbers.add(125);
stringsAndNumbers.add("Омск");
for (int i = 0; i < stringsAndNumbers.size(); i++) {
if (stringsAndNumbers.get(i) instanceof Integer){
stringsAndNumbers.remove(i);
i--;
}
}
System.out.println(stringsAndNumbers);
}
}
