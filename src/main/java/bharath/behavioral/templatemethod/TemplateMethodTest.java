package bharath.behavioral.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) {

        DataRenderer dataRenderer = new XMLDataRenderer();
        dataRenderer.render();

        DataRenderer dataRenderer1 = new CSVDataRenderer();
        dataRenderer1.render();
    }
}
