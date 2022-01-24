package com.hernandes.storeorders.client;

import com.hernandes.storeorders.dto.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("store-products")
public interface ProductClient {

    @GetMapping("/{id}")
    ProductResponse findProductById(@PathVariable("id") String id);
}
