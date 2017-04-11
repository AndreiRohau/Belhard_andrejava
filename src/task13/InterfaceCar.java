package task13;

/**
 * сделать интерфейс машины, у которой есть публичные методы -
 * разблокировать двери,
 * завестись\выключиться,
 * увеличить скорость,
 * уменьшить скорость,
 * переключить передачу,
 * заправить машиную

 */
public interface InterfaceCar {

    public void doorsStatus();
    public void activity();
    public void speedUp();
    public void speedDown();
    public void shiftUpGearbox();
    public void shiftDownGearbox();
    public void fillCar(int volume);

    public interface InterfaceEngine {
        public void needGas();
    }
    public interface InterfaceGasTank {
        public void expenditure();
    }
    public interface InterfaceGearBox {
        public void statusGearBox();
    }

}
