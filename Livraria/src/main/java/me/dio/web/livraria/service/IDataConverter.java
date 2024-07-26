package me.dio.web.livraria.service;

import org.springframework.stereotype.Service;

@Service
public interface IDataConverter {
    <T> T getData(String json, Class<T> clazz);
}