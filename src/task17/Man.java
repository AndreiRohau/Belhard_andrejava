package task17;

/**
 * Должен быть класс Man, у человека есть характеристики
 * - усталость (изначально 0) и выносливость - целое число.
 */
public class Man {
    private int tiredness = 0;
    private int stamina;

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Man(){
        this.tiredness = tiredness;
        this.stamina = stamina;
    }

    public void climb(Mountain mountain){

    }
}
