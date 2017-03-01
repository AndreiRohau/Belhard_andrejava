package Vehicle;

/**
 * Created by Admin on 09.02.2017.
 */
public class VehicleDemo {
    public static void main(String[] args) {
        // Полностью сконструировать объекты транспортных средств
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +
                " миль мини-фургону требуется " +
                gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +
                " миль спортивному автомобилю требуется " +
                gallons + " галлонов топлива");
    }
}
