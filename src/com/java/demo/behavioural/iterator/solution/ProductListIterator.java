package com.java.demo.behavioural.iterator.solution;

import com.java.demo.behavioural.iterator.problem.Product;

public class ProductListIterator implements ProductIterator {

    private Products products;
    private int index;

    public ProductListIterator(Products products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
//        return index < products.productList.size();
        return false;
    }

    @Override
    public Product current() {
//        return products.productList.get(index);
        return new Product(0, "Product");
    }

    @Override
    public void next() {
        index++;
    }
}
