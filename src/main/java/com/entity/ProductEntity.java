package com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products", schema = "crud_database")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;

    @Column(name = "product_name")
    private String product_name;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "details_id", referencedColumnName = "product_details_id")
    ProductDetailsEntity product_details;

    @Override
    public String toString() {
        return "product_id=" + product_id + ", product_name=" + product_name;
    }

}
