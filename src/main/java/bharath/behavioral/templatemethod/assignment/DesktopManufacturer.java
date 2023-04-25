package bharath.behavioral.templatemethod.assignment;

public class DesktopManufacturer extends ComputerManufacturer {
    @Override
    protected void addKeyBoard() {
        System.out.println("Added desktop keyboard");
    }

    @Override
    protected void addRAM() {
        System.out.println("Added desktop ram");
    }

    @Override
    protected void addHardDisk() {
        System.out.println("Added desktop hard disk");
    }
}
