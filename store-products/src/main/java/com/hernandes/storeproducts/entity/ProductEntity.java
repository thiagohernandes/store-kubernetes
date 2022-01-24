package com.hernandes.storeproducts.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Jacksonized
@Builder
@Data
@Document(collection = "products")
public class ProductEntity {

    @Id
    private String id;
    private String description;
    private Double price;

}
