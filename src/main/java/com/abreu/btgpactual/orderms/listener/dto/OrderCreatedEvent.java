package com.abreu.btgpactual.orderms.listener.dto;

import java.util.List;

public record OrderCreatedEvent(
        Long codigoPedido,
        Long codigoClient,
        List<OrderItemEvent> itens
) {
}
