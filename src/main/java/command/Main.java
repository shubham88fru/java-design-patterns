package command;

public class Main {

    public static void main(String[] args) {
//        CustomerService service = new CustomerService();
//        ICommand command = new AddCustomerCommand(service);
//        Button button = new Button(command);
//        button.click();

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BWCommand());
        compositeCommand.execute();
    }
}
