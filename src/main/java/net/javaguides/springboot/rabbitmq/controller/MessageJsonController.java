package net.javaguides.springboot.rabbitmq.controller;

import lombok.RequiredArgsConstructor;
import net.javaguides.springboot.rabbitmq.dto.User;
import net.javaguides.springboot.rabbitmq.publisher.RabbitMQJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MessageJsonController
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - raul.perez.vicente@gmail.com
 * @version 05/09/2026 - 13:42
 * @since 1.25
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MessageJsonController {

    private final RabbitMQJsonProducer rabbitMQJsonProducer;

    @PostMapping("/publish/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user) {
        rabbitMQJsonProducer.sendMessage(user);

        return ResponseEntity.ok("JSON message sent to RabbitMQ successfully");
    }

}
