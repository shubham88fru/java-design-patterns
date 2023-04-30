package bharath.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
    Flyweight pattern uses a factory.
    Flyweight pattern is basically a caching solution.
    It caches created objects so that when a new request to create the same
    object comes, it is returned from the cache instead of creating a new one.
 */
public class ShapeFactory {

    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String type) {
        Shape shape = null;
        if (shapes.get(type) != null) {
            shape = shapes.get(type);
        } else {
            if (type.equals("circle")) shape = new Circle();
            else if (type.equals("rectangle")) shape = new Rectangle();

            shapes.put(type, shape);
        }

        return shape;
    }
}
