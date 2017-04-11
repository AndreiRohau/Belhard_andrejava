package tasksDone.task8.anotherFromWWW;

/**
 * Реализация статического блока инициализации похожа на «раннюю инициализацию»,
 * за исключением того, что экземпляр класса создается в статическом блоке,
 * обеспечивающем возможность обработки исключений.
 *
 * ранняя инициализация и инициализация в статическом блоке создают экземпляр класса еще до того как он вызывается, что не делает их лучшими приемами.
 */

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {

    }

    //блок статической инициализации с возможностью обработки исключительных ситуаций
    static {
        try {
            instance = new StaticBlockSingleton();
        }catch(Exception e) {
            throw new RuntimeException("При создании объекта «Singleton» произошла ошибка");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
