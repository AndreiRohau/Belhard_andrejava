package task17;

import java.util.logging.Logger;

/**
 * Должен быть класс Man, у человека есть характеристики
 * - усталость (изначально 0) и выносливость - целое число.
 */
public class Man {

    private static final Logger log = Logger.getLogger(Man.class.getName());

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

    public Man(int stamina){
        this.tiredness = getTiredness();
        this.stamina = stamina;
    }

    public void climb(Mountain mountain){
        int height = mountain.getHeight();
        int complexity = mountain.getComplexity();
        int tiredness = getTiredness();
        int stamina = getStamina();

        int m = (int) Math.sqrt((double) (height * height + complexity * complexity)); // по сути это длинна пути горы

        if (m < stamina) {
            log.info("Покорил.");
        }else if(m > stamina) {
            log.info("Не покорил.");
            if (m - stamina < 7) {
                log.info("Вызываем вертолет");
            }
        }
        /*
        усталость накапливается по мере подъема на гору и достигает 100 когда человек устал
        выносливость число коэффициент набора усталости
        высота горы - расстояние
        сложность горы коэффициент увеличивающий расход выносливости

         */

    }
}
