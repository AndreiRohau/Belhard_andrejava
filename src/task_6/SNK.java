package task_6;

import java.util.Scanner;

/**
 * Это вариант змейки, когда одно последнее число не задается. в четных змейках есть нюанс. в этом случае он учитан
 * НО в нечетных в этом случае не дорисовываетс 1 символ
 *
 *Во классе снейк все дорисовывается, но в четных на ляпывает 1 лишний символ
 */
public class SNK {
    public static void main(String[] args) {
        //setting the number
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[][] = new int[number][number];
        int i, j, k = 2;

        int count = 0;

        for (i = 0, j = 0; j < arr.length -1; j++) {
            arr[i][j] = 1;
        }
        for (i = 0, j = arr.length - 1; i < arr.length - 1; i++) {
            arr[i][j] = 1;
        }
        for (i = arr.length - 1, j = i; j > 0; j--){
            arr[i][j] = 1;
        }

        while (10 > count) { //todo create cycle for all variants of numbers (2 cycles for 5,7; 3 for 9; 4 for 15)
            //^^^^^^^^^
            for (i = arr.length - 1 - k + 2, j = k - 2; i > k; i--) {
                arr[i][j] = 1;
            }
            //--->>
            for (i = k, j = (k - 2); j < (arr.length -1 - k); j++) {
                arr[i][j] = 1;
            }

            // VVVVV
            for (i = k, j = (arr.length - 1 - k); i < arr.length -1 - k; i++) {
                arr[i][j] = 1;
            }

            // <<<<-----
            for (i = arr.length - 1 - k, j = arr.length - 1 - k; j > k; j--) {
                arr[i][j] = 1;
            }



            count++;
            k += 2;

        }

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

}
