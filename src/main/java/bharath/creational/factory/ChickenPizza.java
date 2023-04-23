package bharath.creational.factory;

public class ChickenPizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("Preparing chicken pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking chicken pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting chicken pizza");
    }
}
