package com.hernandes.storeorders.repository;

import com.hernandes.storeorders.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, String> {

}
