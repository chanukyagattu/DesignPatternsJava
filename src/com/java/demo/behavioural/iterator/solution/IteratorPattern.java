package com.java.demo.behavioural.iterator.solution;

import com.java.demo.behavioural.iterator.problem.Product;

// The Iterator pattern is a design pattern that provides a way to
// access the elements of an aggregate object sequentially without exposing
// its underlying representation. It allows you to traverse a collection of objects
// without needing to know the details of how the collection is implemented.
// In this example, we have a `Products` class that contains a list of `Product` objects,
// and we create an iterator to traverse through the products.

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
