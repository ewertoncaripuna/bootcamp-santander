package me.dio.web.domain;

public class EmailStrategy implements IMessageStrategy {
    @Override
    public void sendMessage(Customer customer, String message) {
        System.out.println("Enviando e-mail para " + customer.getName() + " em " + customer.getContactInfo());
        System.out.println("Mensagem: " + message);
    }
}
