package mosh.command.editor;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello world");

        BoldCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
