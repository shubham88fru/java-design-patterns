package observer;

public class Chart implements IObserver {
    @Override
    public void update() {
        System.out.println("Chart updated..");
    }
}
