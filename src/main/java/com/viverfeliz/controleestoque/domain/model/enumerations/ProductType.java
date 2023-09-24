package com.viverfeliz.controleestoque.domain.model.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public enum ProductType {
    bermuda("Bermuda"),
    shorts("Short"),
    regata("Regata"),
    regataMachao("Regata machão"),
    camiseta("Camiseta"),
    cropped("Cropped"),
    conjunto("Conjunto"),
    macacao("Macacão"),
    calca("Calça"),
    colete("Colete"),
    casacoComCapus("Casaco com capus"),
    miniCasaco("Mini casaco");

    @Getter
    private final String value;

}
