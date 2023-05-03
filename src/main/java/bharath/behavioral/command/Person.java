package bharath.behavioral.command;

public class Person {
    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();

        ICommand onCommand = new OnCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

        ICommand offCommand = new OffCommand(television);
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
    }
}
