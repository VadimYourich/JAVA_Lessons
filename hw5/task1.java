package hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что один человек может иметь несколько телефонов.

public class task1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneNumbers = new HashMap<>();
            getPhoneNumbers(phoneNumbers, "Сократ").
                addAll(Arrays.stream(new String[]{"+7(777)123-45-67", "+7(777)765-43-21"}).toList());
    
            getPhoneNumbers(phoneNumbers, "Иоанн").
                addAll(Arrays.stream(new String[]{"+7(999)999-99-99", "+7(888)888-88-88", "+7(777)777-77-77"}).toList());
    
            getPhoneNumbers(phoneNumbers, "Илия").
                addAll(Arrays.stream(new String[]{"+7(555)700-00-00"}).toList());
    
            System.out.println(phoneNumbers);
    }
    public static List<String> getPhoneNumbers(Map<String, List<String>> phoneNumbers, String name) {
        List<String> phones;
        if (!phoneNumbers.containsKey(name)) {
            phoneNumbers.put(name, new ArrayList<>());
        }
        phones = phoneNumbers.get(name);
        return phones;    
    }
}
