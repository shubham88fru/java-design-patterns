package bharath.behavioral.decorator;

public class PizzaDecorator implements IPizza {
    IPizza pizza;

    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public void bake() {
        pizza.bake();
    }
}
