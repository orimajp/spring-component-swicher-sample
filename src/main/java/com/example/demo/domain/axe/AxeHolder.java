package com.example.demo.domain.axe;

public class AxeHolder {

    private static final ThreadLocal<Axe> axeHolder = new ThreadLocal<>();

    public static void setAxe(Axe axe) {
        axeHolder.set(axe);
    }

    public static Axe getAxe() {
        return axeHolder.get();
    }

    public static void removeAxe() {
        axeHolder.remove();
    }

}
