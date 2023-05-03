package bharath.behavioral.decorator;

public class PizzaShop {
    public static void main(String[] args) {
        IPizza pizza = new PlainPizza();
        pizza.bake();

        System.out.println("------------------");
        IPizza pizza2 = new VeggiePizzaDecorator(pizza);
        pizza2.bake();

        System.out.println("------------------");
        IPizza pizza3 = new CheesePizzaDecorator(pizza2);
        pizza3.bake();
    }
}
