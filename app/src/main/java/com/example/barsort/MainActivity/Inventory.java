package com.example.barsort.MainActivity;

import java.util.*;
public class Inventory<T> {
    private List<T> inventoryItems;

    public Inventory() {
        inventoryItems = new ArrayList<>();
    }

    public void addInventoryItem(T inventoryItem) {
        try {
            inventoryItems.add(inventoryItem);
            System.out.println("Item Added Succesfully: " + inventoryItem);
        } catch (Exception e) {
            System.out.println("Error adding item to inventory: " + e.getMessage());
        }
    }

    public void removeInventoryItem(T inventoryItem) {
        try {
            if(!inventoryItems.contains(inventoryItem)) {
                throw new IllegalArgumentException("Item not found in inventory.");
            }
            inventoryItems.remove(inventoryItem);
            System.out.println("Item removed from inventory successfully: " + inventoryItem);
        } catch (Exception e) {
            System.out.println("Error removing item from inventory.");
        }
    }
    public void viewItems() {
        if (inventoryItems.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory items:");
            for(T inventoryItem : inventoryItems ) {
                System.out.println(inventoryItem);
            }
        }
    }

    public List<T> getInventoryItems() {
        return inventoryItems;
    }

}
