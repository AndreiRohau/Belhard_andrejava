package task_8.from_www_2;

/**
 * Самый простой способ создать потоко-безопасный Singleton класс — это синхронизировать глобальный метод доступа
 * при помощи synchronized, таким образом только одна нить сможет использовать данный метод.
 *
 * но при этом снижается производительность из-за расходов связанных с синхронизацией,
 * хотя последняя необходима только для первых нескольких нитей которые могли бы создать независимый экземпляр класса.
 */

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    //вариант безопасной ленивой инициализации с синхронизацией (всего лишь добавлено поле synchronized)
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * Чтобы ускорить работу программы, используется принцип двойной блокировки с проверкой.
     * При таком подходе внутри синхронизованного блока с помощью конструкции If проводится дополнительная проверка,
     * для гарантии, что будет создан только один экземпляр класса Singleton.
     */
    //вариант безопасной ленивой инициализации - двойная блокировка с проверкой
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}