package TASKs_DONE.task_8.from_www_2;

/**
 * Ранняя реализация (Eager initialization)
 * наипростейший вариант создания класса Одиночки,
 * но он имеет недостаток: экземпляр создается в любом случае,
 * даже если им никто так и не воспользуется
 *
 * Если ваш класс не использует большого количества ресурсов, то такой подход оправдан.
 * Однако чаще всего Singleton-классы создаются для работы с файловыми системами и базами данных и т.п.,
 * когда следует избегать инициализации до момента вызова классом-клиентом метода getInstance.
 * Также этот метод никак не обрабатывает исключения.
 */

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // конструктор private, чтобы не было возможности создать экземпляр класса извне.
    private EagerInitializedSingleton() {

    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

