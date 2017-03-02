package TASKs_DONE.task_9;

import static TASKs_DONE.task_9.SportsmenUtils.totalMedals;

/**
 * есть класс Sportsmen и есть массив, в котором хранятся спортсмены.
 * У спортсменов есть поля - кол-во золотых медалей, серебрянных и бронзовых
 * Написать класс-утилиту SportsmenUtils, в котором будут статические методы, позволяющие отсортировать спортсменов
 * (1. по количеству золотых медалей. 2. по общему числу медалей

 */
public class Main {
    public static void main(String[] args) {

        //array of sportsmen
        int num = 10;
        Sportsmen sportsmenArray [] = new Sportsmen [num];
        for (int i = 0; i < num; i++) {
            sportsmenArray[i] = new Sportsmen ((int) (Math.random() * 100),
                                                (int) (Math.random() * 100),
                                                (int) (Math.random() * 100));

        }

        Sportsmen gold[] = SportsmenUtils.goldMedals(sportsmenArray);

        //реализация метода подсчета золота класса Utils
        for (int i = gold.length - 1; i >= 0; i--) {
            System.out.print(gold[i].getG() + " ");
        }
        System.out.println();

        //реализация метода подсчета всех медалей
        Sportsmen [] total = totalMedals(sportsmenArray);
        for (int i = total.length - 1; i >= 0; i--) {
            System.out.print(total[i].getB() + total[i].getG() + total[i].getS() + " ");
        }


    }
}
