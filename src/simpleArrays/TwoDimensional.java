package simpleArrays;


public class TwoDimensional {
    public static void main(String[] args) {
        // Демонстрация использования двумерного массива
        int t, i;
        int table[][] = new int[3][4];

        for (t = 0; t < 3; ++t) {
            System.out.print("Массив №" + (t+1) + " : ");
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;

                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}