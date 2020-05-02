package com.example.demo.domain.axe;

import lombok.NonNull;

public class AxeHolder {

    private static final ThreadLocal<Axe> axeHolder = new ThreadLocal<>();

    public static void setAxe(@NonNull Axe axe) {
        axeHolder.set(axe);
    }

    public static Axe getAxe() {
        return axeHolder.get();
    }

    public static void removeAxe() {
        axeHolder.remove();
    }

}
