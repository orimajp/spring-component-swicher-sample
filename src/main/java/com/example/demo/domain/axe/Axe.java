package com.example.demo.domain.axe;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Axe {

    GoldAx("gold"),
    SilverAx("silver"),
    IronAx("iron"),
    CopperAx("copper"),
    OtherAx("");

    String material;

    public static Axe getAxe(String axeType) {
        return Arrays.stream(values())
                .filter(axe1 -> axe1.getMaterial().equals(axeType))
                .findFirst()
                .orElseThrow(InvalidAxeTypeException::new);
    }

}
