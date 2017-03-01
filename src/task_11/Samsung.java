package task_11;

/**
 * Created by Admin on 27.02.2017.
 */
public class Samsung extends Device implements DevFunc{

    public Samsung (String name, int type, int price) {
        super(name, type, price);
        super.setCompany("Samsung Corp.");
        super.setStatus("OFF");
    }

    @Override
    public void devFunc () {
        super.on();
        System.out.print(getCompany() + " is glad to welcome. We are happy to know you have bought our " + super.getName() + ".");
        System.out.print(" All systems are " + super.getStatus() + ".");
        System.out.println(" We wish you will enjoy using our " + super.getName());
    }
    @Override
    public void specFunc () {
        if (getType() == "TV") {
            System.out.println("Got the signal... Cable TV is working correctly. You are able to watch 160 channels.");
        }else {
            System.out.println("Trying to call to " + getCompany() + " support service...");
        }
    }
}
