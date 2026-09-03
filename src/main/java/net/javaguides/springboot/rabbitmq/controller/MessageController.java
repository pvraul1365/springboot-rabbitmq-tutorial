package net.javaguides.springboot.rabbitmq.controller;

import lombok.RequiredArgsConstructor;
import net.javaguides.springboot.rabbitmq.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * MessageController
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 03/09/2026 - 19:11
 * @since 1.17
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MessageController {

    private final RabbitMQProducer rabbitMQProducer;

    @RequestMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") final String message) {
        this.rabbitMQProducer.sendMessage(message);

        return ResponseEntity.ok("Message sent to RabbitMQ: " + message);
    }
}
