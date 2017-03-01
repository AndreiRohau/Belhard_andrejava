package TEST;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season.getCountOfDays());
        System.out.println(season.name());

        Season[] seasons = Season.values();
        Season result;
        for (Season i : seasons) {
            if (i.getCountOfDays() == 92) {
                result = i;
                break;
            }
        }
        Season season1 = Season.valueOf("AUTUMN");
    }
}
