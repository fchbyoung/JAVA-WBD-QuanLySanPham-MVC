package controller;

import model.Product;
import service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();

    public Product[] showListProduct(){
        return productService.showListProduct();
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public void editProduct(int id, Product product) {
        productService.editProduct(id, product);
    }

    public Product deleteProduct(int index) {
        return productService.deleteProduct(index);
    }

    public boolean searchProduct(String productName) {
        return false;
    }

    public void sortProductByPrice() {

    }

}
