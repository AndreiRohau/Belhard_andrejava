package TASKs_DONE.task_8.from_www;

/**
 * Проблема с lazy инициализацией остается только в том,
 * что синхронизация нужна по идее только один раз,
 * чтобы несколько потоков не вошли в критическую секцию одновременно.
 * Но после создания экземпляра класса от синхронизации хотелось бы избавиться.
 */

public final class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck _instance = null;

    private SingletonDoubleCheck() {}

    public static synchronized SingletonDoubleCheck getInstance() {
        if (_instance == null)
            synchronized (SingletonDoubleCheck.class) {
                if (_instance == null)
                    _instance = new SingletonDoubleCheck();
            }
        return _instance;
    }
}
