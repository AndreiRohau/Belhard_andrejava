package TASKs_DONE.task_6;

/**
 * Created by Admin on 16.02.2017.
 */
public class Snake {
    public int[][] snake(int number) {
        //setting the number
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();

        int arr[][] = new int[number][number];
        int i, j, k = 2;

        int count = 0;

        for (i = 0, j = 0; j < arr.length; j++) {
            arr[i][j] = 1;
        }
        for (i = 0, j = arr.length - 1; i < arr.length; i++) {
            arr[i][j] = 1;
        }
        for (i = arr.length - 1, j = i; j >= 0; j--){
            arr[i][j] = 1;
        }

        while (arr.length > count) {
            //^^^^^^^^^up
            for (i = arr.length - 1 - k + 2, j = k - 2; i >= k; i--) {
                arr[i][j] = 1;
            }
            //--->>right
            for (i = k, j = (k - 2); j <= (arr.length -1 - k); j++) {
                arr[i][j] = 1;
            }

            // VVVVV   down
            for (i = k, j = (arr.length - 1 - k); i <= arr.length -1 - k; i++) {
                arr[i][j] = 1;
            }

            // <<<<-----left
            for (i = arr.length - 1 - k, j = arr.length - 1 - k; j >= k; j--) {
                arr[i][j] = 1;
            }

            count++;
            k += 2;

        }

        return arr;
    }

    //out.print method for int arrays
    public void outWrite(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void showStatic() {
        System.out.println("Статический метод");
    }

    public void nonStatic() {
        System.out.println("HE cтатический метод");
    }


}
