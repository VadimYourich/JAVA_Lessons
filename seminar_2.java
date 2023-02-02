// /**
//  * Дано число N (>0) и символы c1 и c2.
//  * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//  */

// import java.util.Scanner;

// public class seminar_2 {
//     private static Scanner input = new Scanner(System.in);

//     public static void main(String[] args) {
//         int n = getNumberByUser("Введите четное число N (>0): ");
//         char c1 = getCharByUser("Введите символ С1: ");
//         char c2 = getCharByUser("Введите символ С1: ");
//         System.out.println(getString(n, c1, c2));
//     }

//     public static int getNumberByUser(String text) {
//         System.out.print(text);
//         return input.nextInt();
//     }

//     public static char getCharByUser(String text) {
//         System.out.print(text);
//         String c = input.next();
//         return c.charAt(0);
//     }

//     public static String getString(int x, char a, char b) {
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < x; i++) {
//             if (i % 2 == 0) {
//                 result.append(userString)(a);
//             } else {
//                 result.append(userString)(b);
//             }
//         }
//         return result.toString();
//     }
// }

/**
 * Напишите метод, который сжимает строку. 
 * Пример: aaaabbbcdd → a4b3cd2
 */

 import java.util.Scanner;

 public class seminar_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");    
        String line = scanner.nextLine();
        
        System.out.println(compressString(line));
    }

    public static String compressString(String userString) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int j = 0; j < userString.length() - 1; j++) {
            if (userString.charAt(j) == userString.charAt(j + 1)) {
                count++; 
            } else if (userString.charAt(j) != userString.charAt(j + 1)){
                count++;
                result.append(userString.charAt(j));
                if (count > 1) {
                    result.append(count);
                }
                count = 0;
            }
            if (j == userString.length() - 2 && userString.charAt(userString.length()-2) 
            != userString.charAt(userString.length()-1)) {
                result.append(userString.charAt(j));
                // result.append("1");
            } else if (j == userString.length() - 2 && userString.charAt(userString.length()-2) 
            == userString.charAt(userString.length()-1)){
                count++;
                result.append(userString.charAt(j));
                result.append(count);
            }
        }
        return result.toString();
    }
}
