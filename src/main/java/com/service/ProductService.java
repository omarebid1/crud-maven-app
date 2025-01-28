package com.service;

import com.model.ProductModel;

import java.util.List;

public interface ProductService {

    List<ProductModel> getAllProducts();

    ProductModel getProductById(int id);

    void saveProduct(ProductModel product);

    void updateProduct(ProductModel product);

    void deleteProduct(int id);
}
