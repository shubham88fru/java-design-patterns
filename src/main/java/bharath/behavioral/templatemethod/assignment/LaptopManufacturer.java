package bharath.behavioral.templatemethod.assignment;

public class LaptopManufacturer extends ComputerManufacturer {
    @Override
    protected void addKeyBoard() {
        System.out.println("Added laptop keyboard");
    }

    @Override
    protected void addRAM() {
        System.out.println("Added laptop ram");
    }

    @Override
    protected void addHardDisk() {
        System.out.println("Added laptop hard disk");
    }
}
