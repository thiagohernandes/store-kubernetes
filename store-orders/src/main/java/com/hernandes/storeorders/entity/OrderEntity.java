package com.hernandes.storeorders.entity;

import com.hernandes.storeorders.dto.request.ProductRequest;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Jacksonized
@Builder
@Data
@Document(collection = "orders")
public class OrderEntity {

    @Id
    private String id;
    private LocalDate date;
    private List<ProductRequest> products;

}
