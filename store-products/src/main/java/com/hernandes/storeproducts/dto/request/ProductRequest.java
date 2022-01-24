package com.hernandes.storeproducts.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Data
@AllArgsConstructor
public class ProductRequest {

    private String description;
    private Double price;
}
