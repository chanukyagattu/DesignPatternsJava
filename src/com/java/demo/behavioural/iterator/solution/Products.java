package com.java.demo.behavioural.iterator.solution;

import com.java.demo.behavioural.iterator.problem.Product;

import java.util.ArrayList;
import java.util.List;

public class Products {

//    public List<Product> productList = new ArrayList<>();
    public Product[] productArray = new Product[10];
    private int count = 0;

    public void add(Product product) {
        productArray[count++] = product;
    }

    public Product remove() {
//        var lastIndex = productList.size() - 1;
//        var lastProduct = productList.get(lastIndex);
//        productList.remove(lastIndex);
//
//        return lastProduct;

        return productArray[--count];
    }

    public ProductIterator createProductIterator() {
        return new ProductArrayIterator(this);
    }

}
