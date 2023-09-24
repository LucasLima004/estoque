package com.viverfeliz.controleestoque.domain.usecase;

import java.util.function.Function;

@FunctionalInterface
public interface UseCaseFunction<C, R> extends Function<C, R> {
    R apply(C command);
}
