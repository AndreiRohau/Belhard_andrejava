package Gaidar;

/**
 * Created by Admin on 23.02.2017.
 */
public class Neo {
    private String a, b, c, d;

    public Neo() {
step1();
    }

    public String step1() {
        Utill.message("assalamu aleikum");
        Utill.message("ti prinial moi salam");
        switch (Utill.scan()) {
            case "нет":
                Utill.message("эээ брат _ пошёл!");
                step1();
                break;
            case "я твою маму ебал":
                Utill.message("ко мне иди");
                step1();
                break;
        }
        return null;
    }
}
