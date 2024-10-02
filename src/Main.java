//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Driver originalDriver = new Driver("John Doe", "Toyota Prius");
        System.out.println("Original Driver: " + originalDriver.getName());
        System.out.println("Original Driver’s car: " + originalDriver.getCarModel());

        Driver clonedDriver = originalDriver.clone();
        clonedDriver.setName("Jane Doe");
        System.out.println("Cloned Driver: " + clonedDriver.getName());
        System.out.println("Cloned Driver’s car: " + clonedDriver.getCarModel());
    }
}