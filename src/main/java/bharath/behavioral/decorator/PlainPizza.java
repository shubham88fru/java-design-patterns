package bharath.behavioral.decorator;

public class PlainPizza implements IPizza {
    @Override
    public void bake() {
        System.out.println("Baking plain pizza..");
    }
}
