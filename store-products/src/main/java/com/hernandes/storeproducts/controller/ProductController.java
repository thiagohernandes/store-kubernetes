package com.hernandes.storeproducts.controller;

import com.hernandes.storeproducts.dto.request.ProductRequest;
import com.hernandes.storeproducts.entity.ProductEntity;
import com.hernandes.storeproducts.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository repository;

    @GetMapping
    public ResponseEntity<Iterable<ProductEntity>> getAllProducts() {
        try {
            return ResponseEntity.ok(repository.findAll());
        } catch (Exception e) {
            log.error("Something wrong on find all products", e);
            return null;
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getProductById(@PathVariable("id") String id) {
        try {
            Optional<ProductEntity> product = repository.findById(id);

            return ResponseEntity.ok(product.orElseGet(() -> ProductEntity.builder().build()));
        } catch (Exception e) {
            log.error("Something wrong on get product by id", e);
            return null;
        }
    }

    @PostMapping
    public ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductRequest request) {
        try {
            return ResponseEntity.ok(repository.save(ProductEntity.builder()
                .description(request.getDescription())
                .price(request.getPrice())
                .build()));
        } catch (Exception e) {
            log.error("Something wrong on save product", e);
            return null;
        }
    }
}
