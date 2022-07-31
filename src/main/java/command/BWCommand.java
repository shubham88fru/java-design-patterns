package command;

import command.fx.ICommand;

public class BWCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("bw");
    }
}
