public class PremiumTaxiFactory extends Factory {
    public Taxi createTaxi(String driverName, String license) {
        return new StandardTaxi(driverName, license);
    }
}