package me.dio.web.domain;

import java.util.ArrayList;
import java.util.List;

public class CRM {
    private List<Customer> customers = new ArrayList<>();
    private IMessageStrategy iMessageStrategy;

    public void setMessageStrategy(IMessageStrategy iMessageStrategy) {
        this.iMessageStrategy = iMessageStrategy;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void sendMessageToAll(String message) {
        for (Customer customer : customers) {
            iMessageStrategy.sendMessage(customer, message);
        }
    }
}
