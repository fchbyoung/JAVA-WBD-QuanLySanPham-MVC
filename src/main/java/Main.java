import controller.ProductController;
import model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductController productController = new ProductController();
        int choice;
        do {
            menu();
            System.out.println("You choice?");
            choice  = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Product[] listProducts = productController.showListProduct();
                    break;
                }

                case 2: {
                    System.out.println("-----Add New Product-----");
                    Product product = inputProduct(scanner);
                    productController.addProduct(product);
                    break;
                }

                case 3: {
                    System.out.println("-----Edit Product-----");
                    System.out.println("Edit Product By Index = ?");
                    int index = scanner.nextInt();
                    Product product = inputProduct(scanner);
                    productController.editProduct(index, product);
                    break;
                }

                case 4: {
                    System.out.println("-----Delete Product-----");
                    System.out.println("Delete Product By Index = ?");
                    int index = scanner.nextInt();
                    productController.deleteProduct(index);
                    break;
                }

                case 5: {
                    break;
                }

                case 6: {
                    break;
                }
            }

        } while (choice != 0);

    }

    public static Product inputProduct(Scanner scanner) {
        System.out.println("ProductId:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ProductName:");
        String productName = scanner.nextLine();
        System.out.println("Price:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Description:");
        String description = scanner.nextLine();
        return new Product(id, productName, price, description);
    }

    public static void menu() {
        System.out.println("----------Menu----------");
        System.out.println("1. Show List Products");
        System.out.println("2. Add New Product");
        System.out.println("3. Edit Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Search Product By Name");
        System.out.println("6. Sort Product By Price");
        System.out.println("0. Exit");
    }

}
