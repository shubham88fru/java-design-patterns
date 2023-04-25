package bharath.behavioral.templatemethod;

/*
    render() is a template method, whose implementation
    will be used as a template by all sub-classes. Whereas,
    other methods are all abstract methods, so sub-classes
    will have to provide their own implementations.
 */
public abstract class DataRenderer {

    /*
        The template method.
     */
    public void render() {
        String data = readData();
        String processedData = processData(data);
        System.out.println(processedData);
    }

    public abstract String readData();

    public abstract String processData(String data);
}
