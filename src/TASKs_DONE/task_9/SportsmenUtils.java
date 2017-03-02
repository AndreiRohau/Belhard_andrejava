package TASKs_DONE.task_9;

/**
 * Написать класс-утилиту SportsmenUtils, в котором будут статические методы, позволяющие отсортировать спортсменов
 * (1. по количеству золотых медалей. 2. по общему числу медалей
 */
public class SportsmenUtils {

    //сортировка массива по величине золота
    public static Sportsmen[] goldMedals (Sportsmen [] arr) {
        // Реaлизовaтb aлгоритм пузырbковой сортировки
        for (int a = 1; a < arr.length; a++) {
            for (int b = arr.length - 1; b >= a; b--) {
                if (arr[b - 1].getG() > arr[b].getG()) {
                    Sportsmen temp = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = temp;
                }
            }
        }
        return arr;
    }

    //сортировка объектов по общему количеству медалей
    public static Sportsmen[] totalMedals (Sportsmen [] arr) {
        //подсчитываем все медали
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if ((arr[j - 1].getG() + arr[j - 1].getS() + arr[j - 1].getB()) > (arr[j].getG() + arr[j].getS() + arr[j].getB())) {
                    Sportsmen temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
