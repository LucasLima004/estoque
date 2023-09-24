package com.viverfeliz.controleestoque.domain.usecase.product;

import com.viverfeliz.controleestoque.domain.model.Product;
import com.viverfeliz.controleestoque.domain.model.enumerations.Gender;
import com.viverfeliz.controleestoque.domain.model.enumerations.MaterialType;
import com.viverfeliz.controleestoque.domain.model.enumerations.ProductType;
import com.viverfeliz.controleestoque.domain.usecase.UseCaseFunction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

public interface FindByFiltersUseCase extends UseCaseFunction<FindByFiltersUseCase.Filters, List<Product>> {

    @Override
    List<Product> apply(Filters command);

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    class Filters{
        private String productCode;
        private ProductType productType;
        private String description;
        private MaterialType materialType;
        private Gender gender;
    }
}
