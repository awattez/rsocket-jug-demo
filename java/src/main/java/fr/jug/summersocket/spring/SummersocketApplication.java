package fr.jug.summersocket.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.rsocket.RSocketStrategies;
import org.springframework.messaging.rsocket.annotation.support.RSocketMessageHandler;

@SpringBootApplication
public class SummersocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummersocketApplication.class, args);
    }

}
