package tasksDone.task8.anotherFromWWW;

/**
 *  Когда основной Singleton класс загружен, класс SingletonHelper еще не загружен в память и только,
 *  когда кто-то вызовет метод getInstance этот класс подгружается и создает экземпляр Singleton класса.
 *  фактически отпадает необходимость синхронизации
 */

public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}