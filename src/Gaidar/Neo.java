package Gaidar;

/**
 * Created by Admin on 23.02.2017.
 */
public class Neo {
    public int numBan;
    public int numBranch;
    public int numCoco=1;
    public Neo(Neo neo1){

        for(int i=0;i< neo1.numBranch;i++) {
            Utill.message("Vetki est?");
            if ((numCoco==(Utill.scan()))) {
                Neo neo2 = new Neo(neo1);
            } else {

                Utill.message("collichestvo fructov");
                Bananas(Utill.scan());
                System.out.println("ветка " + i + "колличество фруктов" + numBan);
            }
        }
    }
    public Neo(int n){
        this. numBranch=n;

        }

    public void Bananas(int is){
        this.numBan= is;

    }
}
