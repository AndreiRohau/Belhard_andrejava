package task_10;

/**
 * Created by Admin on 22.02.2017.
 */
public class Freestyler extends Sportsman {

    private int amountOfShows;

    public Freestyler (int a) {
        this.amountOfShows = a;
    }

    //getter and setter starts here

    public int getAmountOfShows() {
        return amountOfShows;
    }

    public void setAmountOfShows(int amountOfShows) {
        this.amountOfShows = amountOfShows;
    }

    //getter and setter ends here

    @Override
    public void start () {
        System.out.print("_Freestyle_");
    }

}
