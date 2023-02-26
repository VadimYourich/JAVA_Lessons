package seminar5;

public class KnightMove {
    public static void main(String[] args) {
        int[][] field = new int[5][5];
        go(1, field, 2, 2);
    }

    private static void go(int number, int[][] field, int x, int y) {
        if (x < 0 || y < 0 || x >= field[0].length || y >= field.length)
            return;
        if (field[y][x] != 0)
            return;
        field[y][x] = number;
        if (number == field[0].length * field.length) {
            print(field);
            System.exit(0);
        }
        go(number + 1, field, x + 1, y + 2);
        go(number + 1, field, x - 1, y + 2);
        go(number + 1, field, x + 1, y - 2);
        go(number + 1, field, x - 1, y - 2);
        go(number + 1, field, x + 2, y - 1);
        go(number + 1, field, x - 2, y - 1);
        go(number + 1, field, x - 2, y + 1);
        go(number + 1, field, x + 2, y + 1);
        field[y][x] = 0;
        }

    private static void print(int[][] field){
        for (int[] array : field) {
            for (int cell : array) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }  
}
