package observer;

public class SpreadSheet implements IObserver {
    @Override
    public void update() {
        System.out.println("Spreadsheet updated..");
    }
}
