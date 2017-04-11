package tasksDone.task8.anotherFromWWW;

/**
 * Для преодоления ситуации с рефлексией Joshua Bloch рекомендует использовать Enum для реализации шаблона Singleton,
 * только так java гарантирует, что любое Enum значение имеет только один экземпляр в программе Java.
 * С тех пор как Enum значения могут иметь глобальный доступ они используются в Singleton.
 * Недостатком является то, что возвращаемый Enum тип, несколько негибкий,
 * например, не поддерживает ленивую инициализацию.
 */

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        //do something
    }
}
