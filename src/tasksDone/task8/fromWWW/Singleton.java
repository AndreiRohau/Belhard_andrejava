package tasksDone.task8.fromWWW;

/**
 * Простая реализация Singleton
 */

//Конструктор класса необходимо объявить с модификатором видимости private.
// Это предотвратит создание экземпляров класса как с помощью класса Singleton, так и с помощью его наследников.
// В связи с этим к объявлению класса смело можно дописать модификатор final.
public final class Singleton {

    //От модификатора synchronized в методе getInstance() можно избавиться.
    // Для этого _instance нужно проинициализировать:
    //private static final Singleton _instance = new Singleton();
    private static Singleton _instance = null;

    //По сути этот кусок кода - и есть сам конструктор
    private Singleton() {}

    //Метод getInstance() создаст ровно один экземпляр класса Singleton.
    // Этот метод объявлен как synchronized.
    // Сделано это вот почему.
    // В многопоточных программах при одновременном вызове метода getInstance()
    // из нескольких потоков можно создать несколько экземпляров класса Singleton.
    public static synchronized Singleton getInstance() {
        if (_instance == null)
            _instance = new Singleton();
        return _instance;
    }
}