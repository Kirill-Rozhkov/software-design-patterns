public abstract class Factory {
    public abstract Driver createDriver(String driverName);
    public abstract Taxi createTaxi(String driverName, String license);
}