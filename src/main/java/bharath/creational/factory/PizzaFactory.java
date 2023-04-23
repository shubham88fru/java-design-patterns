package bharath.creational.factory;

//Factory class that creates a new instance
//on each invocation, based on the type requested
//by the client. The factory method is usually a static
//method, so that clients don't have to keep creating
//its instance. All the objects that can be returned
//by the factory implement a common interface which is
//also the return type of the factory method.
public class PizzaFactory {
    public static IPizza createPizza(String type) {
        IPizza p = null;
        switch (type) {
            case "cheese":
                p = new CheesePizza();
                break;
            case "chicken":
                p = new ChickenPizza();
                break;
            case "veggie":
                p = new VeggiePizza();
                break;
        }

        return p;
    }
}
