package mosh.visitor;

public class HighlightOperation implements IOperation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("highlight heading..");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlight anchor..");
    }
}
