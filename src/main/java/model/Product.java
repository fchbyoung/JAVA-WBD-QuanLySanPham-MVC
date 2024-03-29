package model;

import java.util.Comparator;
import java.util.Scanner;

public class Product implements Comparable<Product> {

    private int productId;
    private String productName;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int productId, String productName, double price, String description) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductID: " + this.getProductId() + ", ProductName: " + this.getProductName() + ", Price: " + this.getPrice() + ", Descriptions: " +this.getDescription();
    }


    @Override
    public int compareTo(Product product) {
        if(this.price > product.price) {
            return 1;
        }
        return -1;
    }
}
