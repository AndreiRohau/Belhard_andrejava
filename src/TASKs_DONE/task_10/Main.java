package TASKs_DONE.task_10;

/**
 * сделать класс Sportsman общим предком для классов - пловец, бегун, фристалист.
 * У класса спортсмен сделать метод start(),
 * а у наследников - переопределить поведение этого метода
 * (например, вывести на консоль сообщение о том, что именно спортсмен начинает делать).
 * В Main классе создать массив спортсменов
 * и сделать метод, который заполняет этот массив созданными спортсменами,
 * затем, в main пробежаться циклом по массиву спортсменов и запустить у них метод start().
 * У Sportsmen должно быть 2 конструктора - один без параметров,
 * второй - с 3 параметрами (кол-во золотых, бронзовых, серебрянных медалей).
 * У пловца сделать конструктор с 4 параметрами
 * (3 от спортсмена  + 1 свой - дистанция, на которой он специализируется.)
 * У фристалиста - только конструктор с одним параметром (количество выступлений).
 * Дублирования кода быть не должно

 */
public class Main {
    public static void main(String[] args) {

        Sportsman arrOfSportsmen [] = new Sportsman[10];
        arrOfSportsmen = setArray(arrOfSportsmen);

        for (int i = 0; i < arrOfSportsmen.length; i++) {
            arrOfSportsmen[i].start();
        }

    }

    public static Sportsman [] setArray(Sportsman [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((((Math.random() * 10)) + 1) > 8) {
                arr[i] = new Freestyler((int) Math.random() * 10);
            }else if ((((Math.random() * 10)) + 1) < 4) {
                arr[i] = new Runner();
            }else {
                arr[i] = new Swimmer((int) Math.random() * 1000);
            }
        }
        return arr;
    }



}
