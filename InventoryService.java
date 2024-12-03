package services;

import models.Product;
import java.util.List;

public class InventoryService {
    private List<Product> products;

    public InventoryService() {
        // Load products from JSON or database
    }

    public void addProduct(Product product) { /* Implementation */ }
    public void editProduct(int id, Product updatedProduct) { /* Implementation */ }
    public void deleteProduct(int id) { /* Implementation */ }
    public List<Product> searchProducts(String keyword) { /* Implementation */ }
    public List<Product> getLowStockProducts() { /* Implementation */ }
}
