package com.viverfeliz.controleestoque.domain.usecase;

import java.util.function.Supplier;

@FunctionalInterface
public interface UseCaseSupplier<C> extends Supplier<C> {
    C get();
}
