package com.viverfeliz.controleestoque.domain.model.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public enum MaterialType {

    tule("Tule"),
    telinha("Telinha"),
    sara("Sara"),
    compressao("Compressao");

    @Getter
    private final String value;
}
