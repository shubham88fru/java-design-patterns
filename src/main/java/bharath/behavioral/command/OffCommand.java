package bharath.behavioral.command;

public class OffCommand implements ICommand {
    Television television;

    public OffCommand(Television television) {
        this.television = television;
    }
    @Override
    public void execute() {
        television.off();
    }
}
