package ru.practicum.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class HelloMessageService {
    private final String message;

    @Autowired
    public HelloMessageService(@Value("${message.word:Hello!}") String message) {
        this.message = message;
    }

    public String getHelloMessage() {
        return message;
    }
}
