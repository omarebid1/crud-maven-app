package com.dao;

import com.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {

    List<ProductEntity> getAllProducts();

    ProductEntity getProductById(int id);

    ProductEntity getProductDetailsById(int id);

    void SaveUpdateProduct(ProductEntity product);

    void deleteProduct(int id);


}
