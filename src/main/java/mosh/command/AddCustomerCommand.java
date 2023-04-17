package mosh.command;

import mosh.command.fx.ICommand;

public class AddCustomerCommand implements ICommand {
    private final CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
