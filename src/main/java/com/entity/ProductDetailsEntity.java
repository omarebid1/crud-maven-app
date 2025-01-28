package com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products_details", schema = "crud_database")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_details_id")
    private int product_details_id;


    @Column(name = "product_manufacturer")
    private String product_manufacturer;

    @Column(name = "product_price")
    private double product_price;

    @Column(name = "product_availability")
    private boolean product_availability;

    @Temporal(TemporalType.DATE)
    @Column(name = "product_expiryDate")
    private Date product_expiryDate;

}
