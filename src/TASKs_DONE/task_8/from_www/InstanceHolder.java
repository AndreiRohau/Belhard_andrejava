package TASKs_DONE.task_8.from_www;

/**
 * Одиночка с ленивой инициализацией
 *
 * Объект будет проинициализирован при первом вызове метода getInstance().
 * мы перенесли проблему с синхронизацией на уровень загрузчика классов (class loader).
 * ПРОБЛЕМА
 * Но что если в приложении несколько Class Loader'ов или
 * вообще у нас распределенная система с несколькими виртуальнми машинами Java
 */
public final class InstanceHolder {
    private InstanceHolder() {}

    private static class Holder {
        private static final InstanceHolder _instance = new InstanceHolder();
    }

    public static InstanceHolder getInstance() {
        return Holder._instance;
    }
}
