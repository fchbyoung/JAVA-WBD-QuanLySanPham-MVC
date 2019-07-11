package repository;

import model.Product;

public interface GeneralRepository<T> {

    T[] showListProduct();

    void addProduct(T product);

    T editProduct(int index, Product product);

    T deleteProduct(int index);

    boolean searchProduct(String productName);

    void sortProductByPrice();

}
