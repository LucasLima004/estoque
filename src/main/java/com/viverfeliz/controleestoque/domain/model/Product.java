package com.viverfeliz.controleestoque.domain.model;

import com.viverfeliz.controleestoque.domain.model.enumerations.Gender;
import com.viverfeliz.controleestoque.domain.model.enumerations.MaterialType;
import com.viverfeliz.controleestoque.domain.model.enumerations.ProductType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String productCode;
    @NotBlank
    private String description;
    @NotNull
    private double value;
    private double additionalValue;
    @NotBlank
    private ProductType type;
    private MaterialType materialType;
    @NotBlank
    private Gender genderClient;
    @NotNull
    private int amount;
}
