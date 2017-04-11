package tasksDone.task7;

/**
 * Created by Admin on 21.02.2017.
 */
public class LearnString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Котэ");
        String tvInfo;
        System.out.println("Длина: " + sb.length());

        //change certain symbol
        StringBuffer sb1 = new StringBuffer("Кит");
        sb1.setCharAt(1, 'o');
        System.out.println(sb1.toString());

        //Позволяет скопировать подстроку из объекта класса StringBuffer в массив.
        // Необходимо позаботиться, чтобы массив был достаточного размера
        // для приёма нужного количества символов указанной подстроки.
        // sb.getChars(_____);

        //Вставляет одну строку в другую.
        // Также можно вставлять значения других типов,
        // которые будут автоматически преобразованы в строки.
        // Вам надо указать индекс позиции, куда будет вставляться строка.

        StringBuffer sb3 = new StringBuffer("Я Котов");
        sb3.insert(2, "Люблю ");
        System.out.println(sb3.toString());

    }
}
