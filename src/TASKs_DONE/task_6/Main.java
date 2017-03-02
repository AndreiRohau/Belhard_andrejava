package TASKs_DONE.task_6;

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
    }
}
