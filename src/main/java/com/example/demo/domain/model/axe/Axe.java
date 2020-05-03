package com.example.demo.domain.model.axe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.Assert;

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

    public static Axe getAxe(String material) {
        Assert.hasText(material, "null or empty character cannot be specified");
        return Arrays.stream(values())
                .filter(axe -> axe.sameMaterial(material))
                .findFirst()
                .orElseThrow(InvalidAxeTypeException::new);
    }

    private boolean sameMaterial(String material) {
        return this.material.equals(material);
    }

}
