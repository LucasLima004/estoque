package com.viverfeliz.controleestoque.domain.usecase;

import java.util.function.Consumer;

@FunctionalInterface
public interface UseCaseConsumer<C> extends Consumer<C> {
    void accept(C command);
}
