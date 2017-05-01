package tasksDone.task24;

/**
 * создать Hashmap, ключ и значение будут строки.
 * Ключи - это страны, Значения - города.
 * Положить в мэп такие пары - Россия - Москва, Беларусь - Минск,
 * Германия - Берлин, Франция - Париж.
 * Удалить город Германии.
 * С помощью TreeSet вывести на экран все города в алфавитном порядке

 */
public class Main {
    public static void main(String[] args) {
        CountryCapitalTable newOne = new CountryCapitalTable();

        //filling table
        newOne.putCountryCapital("Россия", "Москва");
        newOne.putCountryCapital("Беларусь", "Минск");
        newOne.putCountryCapital("Германия", "Берлин");
        newOne.putCountryCapital("Франция", "Париж");

        //remove Germany
        newOne.getCountryCapital().remove("Германия");

        //используя TreeSet вывести на экран все города в алфавитном порядке
        newOne.displayCap();

    }
}
