package com.viverfeliz.controleestoque.domain.usecase.product;

import com.viverfeliz.controleestoque.domain.model.Product;
import com.viverfeliz.controleestoque.domain.usecase.UseCaseConsumer;

public interface DeleteProductUseCase extends UseCaseConsumer<Product> {
    @Override
    void accept(Product command);
}
