package bharath.behavioral.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator{
    public VeggiePizzaDecorator(IPizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        System.out.println("Adding Veggie toppings..");
    }
}
