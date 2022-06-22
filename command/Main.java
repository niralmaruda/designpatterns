package com.designpatterns.command;


import com.designpatterns.command.fx.Button;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // example 1: adding customer.
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();


        // example 2: execute list of command.
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}
