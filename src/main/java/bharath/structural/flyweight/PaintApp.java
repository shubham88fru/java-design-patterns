package bharath.structural.flyweight;

public class PaintApp {
    public void render(int numShapes) {
        Shape shape = null;

        for (int i = 1; i < numShapes; i++) {
            if (i%2 == 0) {
                shape = ShapeFactory.getShape("circle");
                shape.draw(i, "red", "white");
            } else {
                shape = ShapeFactory.getShape("rectangle");
                shape.draw(i, i+i, "dotted");
            }
        }
    }
}
