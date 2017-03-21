package task_13;

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

    public void unlockDoors();
    public void onOff();
    public void speedUp();
    public void speedDown();
    public void shiftUpGearbox();
    public void shiftDownGearbox();
    public void fillCar(int volume);

}
