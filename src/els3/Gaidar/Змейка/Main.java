package els3.Gaidar.Змейка;

/**
 * snake
 *
 * поскольку метод snake B Snake.class is non static, мы должны создать объект типа класса.
 * Snake bitch = new Snake; этим действием мы выделили память(?).
 * далее в bitch.snake(x); мы реализуем метод через объект, т.е. работая в памяти для объекта.
 * метод showStatic - статичный, значит память выделена для него,
 */
public class Main {
    public static void main(String[] args) {

        Snake snake = new Snake(); //что это????
        snake.outWrite(snake.snake(5)); //немонятно что кого!!!!!!!!!!!!!!!
        System.out.println(snake.snake(3)); // hash code

        Snake bitch = new Snake(); // какой то объект
        int [][] B = bitch.snake(10); //save link on certain array!
        System.out.println(B.toString());//хэшкод

        // статический метод вызывается Сразу! через класс
        Snake.showStatic();
        // НЕ статический метод вызывается после создания объекта. создавая объект мы выделяем память!
        Snake nonStatic = new Snake();
        nonStatic.nonStatic(); //

        int[][] df = snake.snake(5);//сохранили ссылку на конкретный массив
        snake.outWrite(df);


    }
}
