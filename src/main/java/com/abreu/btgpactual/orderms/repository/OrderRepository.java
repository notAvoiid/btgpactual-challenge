package com.abreu.btgpactual.orderms.repository;

import com.abreu.btgpactual.orderms.models.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {}
