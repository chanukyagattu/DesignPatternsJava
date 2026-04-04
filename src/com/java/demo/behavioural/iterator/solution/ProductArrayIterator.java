package com.java.demo.behavioural.iterator.solution;

import com.java.demo.behavioural.iterator.problem.Product;

public class ProductArrayIterator implements ProductIterator {

    private Products products;
    private int index;

    public ProductArrayIterator(Products products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return index < products.productArray.length;
    }

    @Override
    public Product current() {
        return products.productArray[index];
    }

    @Override
    public void next() {
        index++;
    }
}
