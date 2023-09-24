package com.viverfeliz.controleestoque.domain.model.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public enum Gender {
    masculino("Masculino"),
    feminino("Feminino");

    @Getter
    private final String value;
}
