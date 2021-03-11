package com.patterns.behavioral.observer;

import com.patterns.structural.composite.Pack;
import com.patterns.structural.composite.Product1;
import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    public void test() {
        assert true;
    }

    @Test
    public void test2() {
        Pack topPack = new Pack();
        Pack midPack_1 = new Pack();
        Pack midPack_2 = new Pack();
        Pack lowPack_1_1 = new Pack();
        Pack lowPack_1_2 = new Pack();

        topPack.addProduct(midPack_1);
        topPack.addProduct(midPack_2);
        midPack_1.addProduct(lowPack_1_1);
        midPack_1.addProduct(lowPack_1_2);

        topPack.addProduct(new Product1(100));
        topPack.addProduct(new Product1(200));
        midPack_1.addProduct(new Product1(10));
        midPack_1.addProduct(new Product1(10));
        midPack_2.addProduct(new Product1(10));
        lowPack_1_1.addProduct(new Product1(1));
        lowPack_1_1.addProduct(new Product1(1));
        lowPack_1_2.addProduct(new Product1(2));


        System.out.println(topPack.count());
        System.out.println(midPack_2.count());
    }
}
