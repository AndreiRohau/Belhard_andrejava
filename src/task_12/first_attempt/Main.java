package task_12.first_attempt;

/**
 * Есть 2 дерева, на одном растут бананы, на другом - кокосы.
 *
 * Дерево состоит из веток (само дерево - главная ветка).
 *
 * На ветке могут быть фрукты (т.е. бананы или кокосы) и другие ветки.
 *
 * Для каждой ветки при ее создании можно задать кол-во фруктов, а если не задавать - то рандом.
 *
 * Есть 3 обезьяны, одна умеет считать кокосы, вторая бананы, а третья - и кокосы и бананы
 * Есть класс - MonkeyManager, в котором есть метод - попросить любую обезьяну посчитать фрукты на любом дереве
 */

public class Main {
    public static void main(String[] args) {
        Branch bananaTree = new Branch();
        bananaTree.getFruitCount();
        System.out.println(bananaTree.getFruitCount());
        System.out.println(bananaTree.getNum());
        Branch [] trunk = bananaTree.getBranch();
        trunk[0] = new Branch();
        long s = trunk[0].getFruitCount();
        int k = trunk[0].getNum();
        System.out.println(s);
        System.out.println(k);


    }
}
