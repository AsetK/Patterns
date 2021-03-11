package com.patterns.structural.composite;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter @RequiredArgsConstructor
public class Product2 implements Countable {

    private final int price;

    @Override
    public int count() {
        return this.price;
    }
}
