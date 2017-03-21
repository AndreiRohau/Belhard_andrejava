package task_13;

/**
 * Created by Admin on 05.03.2017.
 */
public class Car implements InterfaceCar {

    //private String status = "stand"; // or "moving"
    private String doorStatus = "locked";
    private String activity = "off";
    private int speed = 0;
    private int gearBox = 0;
    private int gasTank = 0;

    public Car () {

    }

    public void move() {
        if (this.speed == 0) {
            onOff();
            shiftUpGearbox();
            speedUp();
        }
        Utill.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }

    public void pressGas() {
        if (this.speed > 0) {
            speedUp();
        }
        Utill.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }
    public void pressBreak() {
        if (speed != 0) {
            speedDown();
        }
        Utill.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }

    @Override
    public void unlockDoors() {
        this.doorStatus = "unlock";
    }

    @Override
    public void onOff() {
        if (this.doorStatus.equals("locked")) {
            System.out.println("Wheew-Wheew-Wheew. Guess the doors are still locked");
        } else if (this.gasTank == 0) {
            System.out.println("Wheew-Wheew-Wheew. Guess the gass-tank is empty");
        } else {
            this.activity = "on";
        }
        Utill.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }

    @Override
    public void speedUp() {
        this.speed += 5;
        Utill.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }

    @Override
    public void speedDown() {
        this.speed -= 5;
        Utill.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }

    @Override
    public void shiftUpGearbox() {
        this.gearBox += 1;
        Utill.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }

    @Override
    public void shiftDownGearbox() {
        this.gearBox -= 1;
        Utill.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }

    @Override
    public void fillCar(int volume) {
        this.gasTank += volume;
        Utill.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }
}
