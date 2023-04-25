package bharath.behavioral.templatemethod.assignment;

public abstract class ComputerManufacturer {

    public void buildComputer() {
        addHardDisk();
        addRAM();
        addKeyBoard();
        System.out.println("Computer built");
    }

    protected abstract void addKeyBoard();

    protected abstract void addRAM();

    protected abstract void addHardDisk();
}
