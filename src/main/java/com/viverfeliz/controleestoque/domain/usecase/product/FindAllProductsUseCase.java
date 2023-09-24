package com.viverfeliz.controleestoque.domain.usecase.product;

import com.viverfeliz.controleestoque.domain.model.Product;
import com.viverfeliz.controleestoque.domain.usecase.UseCaseSupplier;

import java.util.List;

public interface FindAllProductsUseCase extends UseCaseSupplier<List<Product>> {
    @Override
    List<Product> get();
}
