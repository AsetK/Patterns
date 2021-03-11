package com.patterns.structural.composite;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Pack implements Countable {

    private List<Countable> products = new ArrayList<>();

    @Override
    public int count() {
        int total = 0;
        List<Integer> prices = products.stream().map(Countable::count).collect(Collectors.toList());

        for (int price : prices) {
            total = total + price;
        }

        return total;
    }

    public void addProduct(Countable countable) {
        products.add(countable);
    }
}
