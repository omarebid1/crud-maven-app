package com.service;

import com.dao.ProductDao;
import com.entity.ProductEntity;
import com.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


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
