package controllers;

import services.InventoryService;

public class InventoryController {
    private InventoryService inventoryService;

    public InventoryController() {
        this.inventoryService = new InventoryService();
    }

    public void handleUserActions() {
        // Logic for interacting with users (Admin/User actions)
    }
}
