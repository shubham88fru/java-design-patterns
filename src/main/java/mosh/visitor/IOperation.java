package mosh.visitor;

public interface IOperation {
    void apply(HeadingNode headingNode);
    void apply(AnchorNode anchor);
}
