package bharath.creational.factory;

public class FactoryTest {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore();
        IPizza cheesePizza = ps.orderPizza("cheese");
        System.out.println("----------------------------");
        IPizza chickenPizza = ps.orderPizza("chicken");
        System.out.println("----------------------------");
        IPizza veggiePizza = ps.orderPizza("veggie");
    }
}
