import java.util.ArrayList;
import java.util.Scanner;


class Product {
    private String name;
    private double price;
    private String category;

    
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
    public void displayProduct() {
        System.out.println("Name: " + name + " | Category: " + category + " | Price: $" + price);
    }
}


class Store {
    private ArrayList<Product> products;

    
    public Store() {
        this.products = new ArrayList<>();
    }

   
    public void addProduct(String name, double price, String category) {
        products.add(new Product(name, price, category));
        System.out.println("Product added successfully!");
    }

    
    public void editProduct(String name, double newPrice) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.setPrice(newPrice);
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    
    public void deleteProduct(String name) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(name));
        System.out.println("Product deleted successfully!");
    }

    
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available!");
            return;
        }
        System.out.println("\nAvailable Products:");
        for (Product product : products) {
            product.displayProduct();
        }
    }
}


public class RetailStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        
        while (true) {
            System.out.println("\nRetail Store Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Enter category (Fruits, Vegetables, Grocery): ");
                    String category = scanner.nextLine();
                    store.addProduct(name, price, category);
                    break;
                
                case 2:
                    System.out.print("Enter product name to edit: ");
                    String editName = scanner.nextLine();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    store.editProduct(editName, newPrice);
                    break;
                    
                case 3:
                    System.out.print("Enter product name to delete: ");
                    String deleteName = scanner.nextLine();
                    store.deleteProduct(deleteName);
                    break;
                    
                case 4:
                    store.displayProducts();
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
