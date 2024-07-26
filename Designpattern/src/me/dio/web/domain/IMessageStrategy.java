package me.dio.web.domain;

public interface IMessageStrategy {
    void sendMessage(Customer customer, String message);
}
