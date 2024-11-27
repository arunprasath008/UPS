package programs;

import java.util.ArrayList;

class Product {
    String name;
    double price;
    int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Inventory {
    ArrayList<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getName().equals(product.getName())) {
                return;
            }
        }
        products.add(product);
    }
    public void removeProduct(String name) {
        products.removeIf(p -> p.getName().equals(name));
    }
    public void displayProducts() {
        for (Product p : products) {
            System.out.println(p.name + " "+p.price);
        }
    }
    public double getTotalInventoryValue() {
        double totalValue = 0.0;
        for (Product p : products) {
            totalValue += p.getPrice() * p.getQuantity();
        }
        return totalValue;
    }
}
class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product("Laptop", 999.99, 5));
        inventory.addProduct(new Product("PS5", 1022.33, 3));
        inventory.displayProducts();
        System.out.println("Total Inventory Value: $" + inventory.getTotalInventoryValue());
        inventory.removeProduct("Laptop");
        inventory.displayProducts();

    }
}

