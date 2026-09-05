package net.javaguides.springboot.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import net.javaguides.springboot.rabbitmq.dto.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * RabbitMQJsonConsumer
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - raul.perez.vicente@gmail.com
 * @version 05/09/2026 - 14:05
 * @since 1.25
 */
@Service
@Slf4j
public class RabbitMQJsonConsumer {

    // Method to consume JSON messages from RabbitMQ
    @RabbitListener(queues = "${rabbitmq.json.queue.name}")
    public void receiveJsonMessage(final User user) {
        log.info("Received JSON message: {}", user);
    }

}
