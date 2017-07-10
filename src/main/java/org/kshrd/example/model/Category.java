package org.kshrd.example.model;

import java.util.ArrayList;

/**
 * Created by Saravit on 7/10/2017.
 */
public class Category {
    private int category_id;
    private String category_name;
    private ArrayList<Product> products;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
