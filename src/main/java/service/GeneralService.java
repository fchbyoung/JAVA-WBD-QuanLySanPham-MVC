package service;

import model.Product;
import repository.GeneralRepository;

public interface GeneralService<T>{

    T[] showListProduct();

    void addProduct(T product);

    Product editProduct(int id, Product product);

    Product deleteProduct(int index);

    boolean searchProduct(String productName);

    void sortProductByPrice();
}
