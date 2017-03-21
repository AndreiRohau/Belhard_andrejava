package task_12;

import java.util.Scanner;

/**
 * Created by Admin on 02.03.2017.
 */
public class Branch {
    private int fruit;
    private int num;
    private Branch [] branches;

    public Branch() {
        this.fruit = addFruit();
        this.num = setBranches();
        this.branches = growBranches();
    }

    //при помощи этого метода мы можем задать количество фруктов при создании объекта или рандомить
    public int addFruit() {
        System.out.print("Сколько фруктов на этой ветке? (Введи число фруктов и нажмите ввод, ");
        System.out.println("ввод иных значений задаст случайное количество фруктов. ");

        Scanner sc = Utill.scanPut();
        if (sc.hasNextInt()) {
            fruit = sc.nextInt();
        } else {
            fruit = (int) (Math.random() * 10);
        }
        return fruit;
    }

    //при помощи этого метода мы можем задать количество веток на создаваемом экземпляре-ветке, либо зарандомить
    public int setBranches() {
        System.out.println("Сколько веток будет на нашей ветке? (Введи число и нажмите ввод, " +
                "ввод иных значений задаст случайное количество веток. ");
        Scanner sc = Utill.scanPut();
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            num = (int) (Math.random() * 10);
        }
        System.out.println("На ветке " + num + " веток");
        return num;
    }

    //этим методом мы фактически создаем (выращиваем) новые ветки на экземпляре
    public Branch [] growBranches() {
        this.branches = new Branch [num];
        for (int i = 0; i < branches.length; i++) {
            branches[i] = new Branch();
        }
        return branches;
    }

    //подсчет всех фруктов
    public int monkey() {
        int result;
        result = getFruit();
        if (this.branches.length > 0) {
            for (int i = 0; i < branches.length; i++) {
                result = result + this.branches[i].monkey();
            }
        }
        return result;
    }


    public int getFruit() {
        return fruit;
    }

    public void setFruit(int fruit) {
        this.fruit = fruit;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Branch[] getBranches() {
        return branches;
    }

    public void setBranches(Branch[] branches) {
        this.branches = branches;
    }

}
