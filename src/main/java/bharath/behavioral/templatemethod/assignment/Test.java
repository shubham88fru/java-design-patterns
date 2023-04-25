package bharath.behavioral.templatemethod.assignment;

public class Test {
    public static void main(String[] args) {
        ComputerManufacturer manufacturer = new DesktopManufacturer();
        manufacturer.buildComputer();
        System.out.println("---------------------------");
        ComputerManufacturer manufacturer1 = new LaptopManufacturer();
        manufacturer1.buildComputer();
    }
}
