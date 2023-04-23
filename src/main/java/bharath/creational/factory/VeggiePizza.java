package bharath.creational.factory;

public class VeggiePizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("Preparing veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting veggie pizza");
    }
}
