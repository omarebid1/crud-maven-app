package com.dao;

import com.entity.ProductEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveProduct(ProductEntity product) {
        sessionFactory.getCurrentSession().save(product);
    }

    public List getAllProduct() {
        return sessionFactory.getCurrentSession().createQuery("from ProductEntity ", ProductEntity.class).list();
    }

}
