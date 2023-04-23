package bharath.creational.factory;

public class PizzaStore {
    public IPizza orderPizza(String type) {
        IPizza p = PizzaFactory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        return p;
    }
}
