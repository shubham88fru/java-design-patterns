package command;

import command.fx.ICommand;

public class ResizeCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("resize");
    }
}
