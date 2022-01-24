package com.hernandes.storeorders.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Data
@AllArgsConstructor
public class ProductResponse {

    private String id;
    private String description;
    private Double price;

}
