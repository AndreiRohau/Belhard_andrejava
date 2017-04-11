package els3.finalizer;


public class FDemo {
     int х;

    FDemo(int i) {
        this.х = i;
    }
// Вызывается при удалении объекта
    protected void finalize() {
        System.out.println("Финaлизaция " + х);
    }
// Генерирует объект, который тотчас же уничтожается
    void generator(int i) {
        FDemo о = new FDemo(i);
    }


}
