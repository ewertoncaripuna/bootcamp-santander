package me.dio.web.domain;

public class SMSStrategy implements IMessageStrategy {
    @Override
    public void sendMessage(Customer customer, String message) {
        System.out.println("Enviando SMS para " + customer.getName() + " em " + customer.getContactInfo());
        System.out.println("Mensagem: " + message);
    }
}
