package com.service;

import com.model.ProductModel;

import java.util.Collections;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductModel> getAllProducts() {
        return Collections.emptyList();
    }

    @Override
    public ProductModel getProductById(int id) {
        return null;
    }

    @Override
    public void saveProduct(ProductModel product) {

    }

    @Override
    public void updateProduct(ProductModel product) {

    }

    @Override
    public void deleteProduct(int id) {

    }
}
