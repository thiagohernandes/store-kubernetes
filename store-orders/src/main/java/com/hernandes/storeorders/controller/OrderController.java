package com.hernandes.storeorders.controller;

import com.hernandes.storeorders.client.ProductClient;
import com.hernandes.storeorders.dto.request.OrderRequest;
import com.hernandes.storeorders.dto.response.ProductResponse;
import com.hernandes.storeorders.entity.OrderEntity;
import com.hernandes.storeorders.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository repository;
    private final ProductClient client;

    @GetMapping
    public ResponseEntity<Iterable<OrderEntity>> getAllOrders() {
        try {
            return ResponseEntity.ok(repository.findAll());
        } catch (Exception e) {
            log.error("Something wrong on find all orders", e);
            return null;
        }
    }

    @GetMapping("/products/{idProduct}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable("idProduct") String idProduct) {
        try {
            return ResponseEntity.ok(client.findProductById(idProduct));
        } catch (Exception e) {
            log.error("Something wrong on orders to find product by id", e);
            return null;
        }
    }

    @PostMapping
    public ResponseEntity<OrderEntity> saveOrder(@RequestBody OrderRequest request) {
        try {
            return ResponseEntity.ok(repository.save(OrderEntity.builder()
                .date(request.getDate())
                .products(request.getProducts())
                .build()));
        } catch (Exception e) {
            log.error("Something wrong on save order", e);
            return null;
        }
    }
}
