package com.model;

import com.entity.ProductDetailsEntity;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDetailsModel {

    int model_id;

    @NotBlank
    String model_manufacturer;

    @DecimalMin(value = "0.0")
    double model_price;

    boolean model_available;

    @NotNull(message = "mandatory field")
    @Future(message = "invalid Date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date model_expiryDate;

    public ProductDetailsModel(ProductDetailsEntity productDetailsEntity) {
        this.model_id = productDetailsEntity.getProduct_details_id();
        this.model_manufacturer = productDetailsEntity.getProduct_manufacturer();
        this.model_price = productDetailsEntity.getProduct_price();
        this.model_available = productDetailsEntity.isProduct_availability();
        this.model_expiryDate = productDetailsEntity.getProduct_expiryDate();
    }
}
