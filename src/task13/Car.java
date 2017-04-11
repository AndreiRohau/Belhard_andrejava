package task13;

import java.util.logging.Logger;

/**
 * Created by Admin on 05.03.2017.
 */
public class Car implements InterfaceCar {
    private static final Logger log = Logger.getLogger(Car.class.getName());

    //private String status = "stand"; // or "moving"
    private String doors = "locked";
    private String act = "off";
    private int speed = 0;
    private int gearBox = 0;
    private int gasTank = 0;
    private int engGasExp = 5; //1 littre for 5 km
    private int timeHours = 1; //hours of driving
    //getters START
    public String getDoors() {
        return doors;
    }

    public String getActivity() {
        return act;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGearBox() {
        return gearBox;
    }

    public int getGasTank() {
        return gasTank;
    }

    public int getEngGasExp() {
        return engGasExp;
    }

    public int getTimeHours() {
        return timeHours;
    }
    //getters END

    public Car (/*String doors, String act, int speed, int gearBox, int gasTank*/) {
        /*this.doors = doors;
        this.act = act;
        this.speed = speed;
        this.gearBox = gearBox;
        this.gasTank = gasTank;
        */
    }

    public void move() {
        if (this.speed == 0) {
            activity();
            shiftUpGearbox();
            speedUp();
        }else {
            err0r();
        }
        status();
    }

    public void pressGasPedal() {
        speedUp();
        status();
    }
    public void pressBreakPedal() {
        speedDown();
        status();
    }

    @Override
    public void doorsStatus() {
        this.doors = "unlock";
    }

    @Override
    public void activity() {
        if (this.doors.equals("locked")) {
            log.info("Wheew-Wheew-Wheew. Guess the doors are still locked");
        } else if (this.gasTank == 0) {
            log.info("Khhhrrrggghhhh.. puf... Guess the gass-tank is empty");
        } else {
            this.act = "on";
        }
        status();
    }

    @Override
    public void speedUp() {
        if (this.gearBox > 0) {
            this.speed += 5;
        } else if (this.gasTank == 0) {
            log.info("Khhhrrrggghhhh.. puf... Guess the gass-tank is empty");
        }else {
            err0r();
        }
        status();
    }

    @Override
    public void speedDown() {
        if (speed > 0) {
            this.speed -= 5;
        }else {
            err0r();
        }
        status();
    }

    @Override
    public void shiftUpGearbox() {
        if (act.equals("on")) {
            this.gearBox += 1;
        }else {
            err0r();
        }
        status();
    }

    @Override
    public void shiftDownGearbox() {
        if (gearBox > 0) {
            this.gearBox -= 1;
        }else {
            err0r();
        }
        status();
    }

    @Override
    public void fillCar(int volume) {
        this.gasTank += volume;
        status();
    }

    public void status() {
        Util.msg("Speed is " + this.speed + ". Gearbox position is " + this.gearBox);
    }
    public void err0r() {
        log.info("Shhhhit! Nothing has happened!!!");
    }

    public class Engine implements InterfaceEngine {
        private String engine = getActivity();

        public Engine(String engine) {
            this.engine = engine;
            if (engine.equals("ON")) {
                GasTank gasTank = new GasTank();
                gasTank.expenditure();
            }
            needGas();
        }
        @Override
        public void needGas() {
            if (gasTank == 0) {
                speed = 0;
                gearBox = 0;
                gasTank = 0;
            }
        }
    }

    public class GasTank implements InterfaceGasTank {
        private int gasTank;

        public GasTank() {
           this.gasTank = getGasTank();

        }

        @Override
        public void expenditure() {
            gasTank = gasTank - getSpeed() * getTimeHours() / getEngGasExp();
        }
    }

    public class GearBox implements InterfaceGearBox {
        private int gearBoxPosition;

        public GearBox() {
            gearBoxPosition = getGearBox();
            statusGearBox();
        }

        @Override
        public void statusGearBox() {
            if (gasTank == 0) {
                speed = 0;
                gearBox = 0;
                gasTank = 0;
            }
        }
    }

}
