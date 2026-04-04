package com.java.demo.behavioural.iterator.solution;

import com.java.demo.behavioural.iterator.problem.Product;

public class IteratorPattern {
    public static void main(String[] args) {
        var products = new Products();
        products.add(new Product(100, "Product 1"));
        products.add(new Product(200, "Product 2"));
        products.add(new Product(300, "Product 3"));

        ProductIterator iterator = products.createProductIterator();
        while (iterator.hasNext()) {
            var product = iterator.current();
            System.out.println(product);
            iterator.next();
        }
    }
}
