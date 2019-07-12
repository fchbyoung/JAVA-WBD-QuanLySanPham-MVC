package repository;

import model.Product;

public class ProductRepository implements GeneralRepository<Product> {
    Product[] listProducts = new Product[10];

    int SIZE = 4;
    {
        listProducts[0] = new Product(1, "SamSung", 10, "SS");
        listProducts[1] = new Product(2, "Iphone", 20, "IP");
        listProducts[2] = new Product(3, "OPPO", 30, "OP");
        listProducts[3] = new Product(4, "Nokia", 40, "NK");

    }
    @Override
    public Product[] showListProduct() {
        System.out.println("-----List Products-----");
        for (int i = 0; i < SIZE; i++) {
            if(listProducts[i] != null) {
                System.out.println("ProductID: " + listProducts[i].getProductId()
                        + ", ProductName: " + listProducts[i].getProductName()
                        + ", Price: " + listProducts[i].getPrice()
                        + ", Description: " + listProducts[i].getDescription());
            }
        }
        return listProducts;
    }

    @Override
    public void addProduct(Product product) {
        for (int i = 0; i < SIZE; i++) {
            if(listProducts[i] == null) {
                listProducts[i] = product;
                SIZE++;
                break;
            }
        }
    }

    @Override
    public Product editProduct(int index, Product product) {
        listProducts[index] = product;
        return listProducts[index];
    }

    @Override
    public Product deleteProduct(int index) {
        Product newProduct = listProducts[index];
        for (int i = index; i < SIZE - 1; i++) {
            listProducts[i] = listProducts[i + 1];
        }
        return newProduct;
    }

    @Override
    public Product searchProduct(String productName) {
        int index = -1;
        for (int i = 0; i < SIZE; i++) {
            if(listProducts[i].getProductName().equalsIgnoreCase(productName)) {
                index = i;
            }
        }
        if (index < 0) {
            return null;
        }
        return listProducts[index];
    }

    @Override
    public void sortProductByPrice() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(listProducts[i].compareTo(listProducts[j]) > 0) {
                    Product temp = listProducts[i];
                    listProducts[i] = listProducts[j];
                    listProducts[j] = temp;
                }
            }
        }
    }

}
