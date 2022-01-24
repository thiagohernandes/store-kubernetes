package com.hernandes.storeorders.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDate;
import java.util.List;

@Jacksonized
@Data
@AllArgsConstructor
public class OrderRequest {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate date;
    private List<ProductRequest> products;
}
