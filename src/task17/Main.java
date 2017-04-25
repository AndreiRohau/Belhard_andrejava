package task17;

/**
 * написать программу для людей, поднимающихся в горы.
 * Должен быть класс Man, у человека есть характеристики
 * - усталость (изначально 0) и выносливость - целое число.
 * Должен быть класс - Mountain,
 * у горы есть характеристики - высота, сложность (числа).
 * У человека должен быть метод climb(Mountain mountain).
 * Если человек устал на высоте выше 7 км, то ему нужно вызвать вертолет,
 *
 * *********************************************************************
 * **********для этого человек должен отправить Exception в файл для логов.
 * **************************************************************************
 *
 * Сделать несколько гор (по сложности и высоте)
 * и несколько людей (с разной выносливостью) и проверить, кто куда сможет подняться
 */
public class Main {
    public static void main(String[] args) {
        Mountain everest = new Mountain(10, 5);
        Mountain ural = new Mountain(4, 3);
        Mountain alpine = new Mountain(7, 4);

        Man stan = new Man(9);
        Man eric = new Man(5);
        Man kyle = new Man(8);
        Man kenny = new Man(7);

        stan.climb(everest);
        stan.climb(ural);
        stan.climb(alpine);

        eric.climb(everest);
        eric.climb(ural);
        eric.climb(alpine);

        kyle.climb(everest);
        kyle.climb(ural);
        kyle.climb(alpine);

        kenny.climb(everest);
        kenny.climb(ural);
        kenny.climb(alpine);


    }



}
