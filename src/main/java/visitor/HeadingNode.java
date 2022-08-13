package visitor;

public class HeadingNode implements IHTMLNode {

    @Override
    public void execute(IOperation operation) {
        operation.apply(this);
    }
}
