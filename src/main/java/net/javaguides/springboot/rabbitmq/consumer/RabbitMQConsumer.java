package net.javaguides.springboot.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * RabbitMQConsumer
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 05/09/2026 - 08:58
 * @since 1.17
 */
@Service
@Slf4j
public class RabbitMQConsumer {

    // This class is intended to be a consumer for RabbitMQ messages.
    // You can implement methods to listen to the queue and process incoming messages.

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void consumeMessage(final String message){
        log.info("Received message: {}", message);
    }
}
