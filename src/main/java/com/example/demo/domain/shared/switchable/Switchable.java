package com.example.demo.domain.shared.switchable;

public interface Switchable<T> {

    default boolean isDefault() {
        return false;
    }

    T getComponentKey();

}
