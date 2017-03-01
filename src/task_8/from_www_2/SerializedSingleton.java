package task_8.from_www_2;

import java.io.Serializable;

/**тест этого конструктора - в SerializedSingletonTest
 * Иногда в распределенных системах, нам нужно реализовать интерфейс Serializable в классе Singleton,
 * чтобы мы могли сохранить его состояние в файловой системе и получить его в более поздний момент времени.
 * Проблема с сериализацией для класса синглтон - как только мы воссоздадите объект,
 * он тут же инициализирует экземпляр класса.
 *
 * Проблема с сериализацией для класса синглтон выше, заключается в том,
 * что как только мы воссоздадите объект, он тут же инициализирует экземпляр класса.
 */

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    //Решение проблемы выше - реализация следующего метода
    protected Object readResolve() {
        return getInstance();
    }

}
