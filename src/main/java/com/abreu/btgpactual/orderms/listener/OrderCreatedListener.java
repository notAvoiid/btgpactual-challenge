package com.abreu.btgpactual.orderms.listener;

import com.abreu.btgpactual.orderms.listener.dto.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static com.abreu.btgpactual.orderms.config.RabbitMqConfig.ORDER_CREATED_QUEUE;

@Component
@Slf4j
public class OrderCreatedListener {

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message) {
        log.info("Message consumed: {}", message);
    }

}
