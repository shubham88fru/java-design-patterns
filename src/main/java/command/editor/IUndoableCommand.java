package command.editor;

public interface IUndoableCommand extends ICommand {
    void unexecute();
}
