package service;

import model.Product;
import repository.GeneralRepository;

public interface GeneralService<T>{

    T[] showListProduct();

    void addProduct(T product);

    T editProduct(int id, Product product);

    T deleteProduct(int index);

    T searchProduct(String productName);

    void sortProductByPrice();
}
