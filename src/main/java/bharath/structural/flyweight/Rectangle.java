package bharath.structural.flyweight;

public class Rectangle extends Shape {
    private String label;

    public Rectangle() {
        label = "rectangle";
    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a rectangle - " + label + " with breadth - "
                + breadth + " with length " + length + " fill style " + fillStyle);
    }
}
