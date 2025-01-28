package com.model;

import com.entity.ProductEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductModel {

    int id;

    @NotBlank(message = "mandatory")
    String name;

    @Valid
    ProductDetailsModel detailsModel;

    public ProductModel(ProductEntity productEntity) {
        this.id = productEntity.getProduct_id();
        this.name = productEntity.getProduct_name();
    }

}
