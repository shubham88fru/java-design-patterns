package mosh.visitor;

public class AnchorNode implements IHTMLNode{
    @Override
    public void execute(IOperation operation) {
        operation.apply(this);
    }
}
