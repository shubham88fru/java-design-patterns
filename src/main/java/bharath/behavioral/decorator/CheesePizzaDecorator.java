package bharath.behavioral.decorator;

public class CheesePizzaDecorator extends PizzaDecorator{
    public CheesePizzaDecorator(IPizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        System.out.println("Adding Cheese toppings..");
    }
}
