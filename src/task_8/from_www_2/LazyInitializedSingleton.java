package task_8.from_www_2;

/**
 * Ленивая инициализация — способ реализации шаблона Singleton с глобальной методом доступа к экземпляру класса.
 *
 */

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}