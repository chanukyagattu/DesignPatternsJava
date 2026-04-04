package com.java.demo.behavioural.iterator.solution;

import com.java.demo.behavioural.iterator.problem.Product;

public interface ProductIterator {

    boolean hasNext();
    Product current();
    void next();

}
