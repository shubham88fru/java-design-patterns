package mosh.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements IComponent {
    private final List<IComponent> components  = new ArrayList<>();

    public void add(IComponent component) {
        components.add(component);
    }

    @Override
    public void render() {
        for (IComponent component: components) {
            component.render();
        }
    }

    @Override
    public void move() {
        for (IComponent component: components) {
            component.move();
        }
    }
}
