package visitor;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument {
    private final List<IHTMLNode> nodes = new ArrayList<>();
    public void add(IHTMLNode node) {
        nodes.add(node);
    }
    public void execute(IOperation operation) {
        for (IHTMLNode node: nodes) node.execute(operation);
    }

}
