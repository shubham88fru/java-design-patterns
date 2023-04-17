package mosh.command;

public class Main {

    public static void main(String[] args) {
//        CustomerService service = new CustomerService();
//        ICommand mosh.command = new AddCustomerCommand(service);
//        Button button = new Button(mosh.command);
//        button.click();

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BWCommand());
        compositeCommand.execute();
    }
}
