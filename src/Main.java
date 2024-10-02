//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver.DriverBuilder()
                .withName("Johny Silverhand")
                .withCarModel("Porshe 911")
                .withLicenseNumber("XYZ12345")
                .withExperienceYears(5)
                .isAvailable(true)
                .build();

        System.out.println(driver);
    }
}