package hw2;

/*
 * В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
Значения null не включаются в запрос.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {

        String sqlRequest = createSQLrequest(formatData(getStringFromFile("hw2/file1.txt")));
        System.out.println(sqlRequest);
    }

// Метод считывает данные из файла
    
    public static String getStringFromFile(String path) {
        
        StringBuilder resultLine = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                resultLine.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return resultLine.toString();
    }

// Метод форматирует данные из строки в двумерный массив

    public static String[][] formatData(String data) {
        
        data = data.replace("{", "");
        data = data.replace("}", "");
        data = data.replace("\"", "");

        String[] arrData = data.split(",");
        String[][] resarr = new String[arrData.length][2];
        String[] parts;
        int i = 0;
        for (int j = 0; j < resarr.length; j++) {
            parts = arrData[i].split(":");
            i++;
            for (int k = 0; k < resarr[1].length; k++) {
                resarr[j][k] = parts[k];
            }
        }
        
        return resarr;
    }

// Метод формирует SQL запрос на основании данных из двумерного массива

    public static String createSQLrequest(String[][] arrayData) {

        StringBuilder sqlRequest = new StringBuilder();
        sqlRequest.append("SELECT*FROM students WHERE ");
        List<String> resultList = new ArrayList<>();
        
        for (int j = 0; j < arrayData.length; j++) {
            if (!arrayData[j][1].equals("null")) {
                String part = String.format("%s=\"%s\"", arrayData[j][0], arrayData[j][1]);
                resultList.add(part);
            }
        }
        sqlRequest.append(String.join(" AND ", resultList));

        return sqlRequest.toString();
    }
}
