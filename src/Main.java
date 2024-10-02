//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Passenger passenger = new Passenger();

        DriverManager driverManager = DriverManager.getInstance();

        String driver = driverManager.findNearestDriver("Location A");

    // passenger.assignTaxi(driver);

    }

}