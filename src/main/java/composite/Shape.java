package composite;

public class Shape implements IComponent {

    @Override
    public void render() {
        System.out.println("render shape");
    }

    @Override
    public void move() {
        System.out.println("Moving shape");
    }

}
