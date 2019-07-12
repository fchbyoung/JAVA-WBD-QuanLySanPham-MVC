package service;

import model.Product;
import repository.ProductRepository;

public class ProductService implements GeneralService<Product> {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public Product[] showListProduct() {
        return productRepository.showListProduct();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public Product editProduct(int id, Product product) {
        return productRepository.editProduct(id, product);
    }

    @Override
    public Product deleteProduct(int index) {
        return productRepository.deleteProduct(index);
    }


    @Override
    public Product searchProduct(String productName) {
        return productRepository.searchProduct(productName);
    }

    @Override
    public void sortProductByPrice() {
        productRepository.sortProductByPrice();
    }
}
