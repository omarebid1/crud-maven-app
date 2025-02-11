package com.dao;

import com.entity.ProductEntity;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.Collections;
import java.util.List;

@Repository
public class ProductDaoImp implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Override
    @Transactional(readOnly = true)
    public List<ProductEntity> getAllProducts() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from ProductEntity", ProductEntity.class).list();
        }
    }

    @Override
    @Transactional(readOnly = true)
    public ProductEntity getProductById(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(ProductEntity.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public ProductEntity getProductDetailsById(int id) {
        try (Session session = sessionFactory.openSession()) {
            ProductEntity productEntity = session.get(ProductEntity.class, id);
            if (productEntity != null) {
                Hibernate.initialize(productEntity.getProduct_details());
            }
            return productEntity;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void SaveUpdateProduct(ProductEntity product) {
        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(product);
            transactionManager.commit(status); // Commit the transaction
        } catch (Exception e) {
            transactionManager.rollback(status); // Rollback on error
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProduct(int id) {
        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
        try {
            ProductEntity product = sessionFactory.getCurrentSession().get(ProductEntity.class, id);
            if (product != null) {
                sessionFactory.getCurrentSession().delete(product);
                transactionManager.commit(status); // Commit the transaction
            }
        } catch (Exception e) {
            transactionManager.rollback(status); // Rollback on error
            e.printStackTrace();
        }
    }
}
