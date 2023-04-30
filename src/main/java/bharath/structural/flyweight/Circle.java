package bharath.structural.flyweight;

public class Circle extends Shape {
    private String label;

    public Circle() {
        this.label = "circle";
    }


    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a circle - " + label + " with radius - "
         + radius + " fill color - " + fillColor + " line color - " + lineColor);
    }
}
