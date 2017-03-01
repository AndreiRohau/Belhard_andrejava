package task_8;

import java.io.Serializable;

/**
 * Наиболее унивирсальный способ создания синглтона
 */

public class Singleton implements Serializable { //можно ли добавить final. и что такое сериализация
    private static final long serialVersionUID = 1L;

    private Singleton() {
        // private constructor
    }

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}