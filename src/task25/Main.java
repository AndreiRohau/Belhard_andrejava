package task25;

/**
 * Created by rohau.andrei on 29.04.2017.
 */

public class Main {
    public static void main(String[] args) {

        ErrorTask newOne = new ErrorTask();

        for(int i = 0; i < newOne.getErrorList().size(); i++){
            try{
                //ловим ошибочку!
                System.out.println("Ошибочка " + newOne.getErrorList().get(i) + " отработала!");
            }catch(Throwable e){
                //а это мы не увидим
                System.out.println(e + " - Ты не увидишь этого!");
            }
        }

    }

}