package state;

public class Eraser implements ITool{
    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }
}
