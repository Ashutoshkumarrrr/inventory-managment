package main;

import controllers.InventoryController;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the InventoryController to start the application
        InventoryController inventoryController = new InventoryController();
        // Call the method to handle user actions
        inventoryController.handleUserActions();
    }
}
