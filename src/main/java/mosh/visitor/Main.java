package mosh.visitor;

public class Main {
    public static void main(String[] args) {
        HTMLDocument document = new HTMLDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
    }
}
