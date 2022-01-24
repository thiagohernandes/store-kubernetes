package com.hernandes.storeproducts.repository;

import com.hernandes.storeproducts.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, String> {

}
