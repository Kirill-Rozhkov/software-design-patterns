public class StandardFactory extends Factory {
    @Override
    public Driver createDriver(String driverName) {
        return new StandardDriver(driverName);
    }

    @Override
    public Taxi createTaxi(String driverName, String license) {
        Driver driver = createDriver(driverName);
        return new StandardTaxi(driver, license);
    }
}