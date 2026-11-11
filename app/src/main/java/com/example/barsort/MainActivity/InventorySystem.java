package com.example.barsort.MainActivity;

import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {
        Inventory<inventoryItem> inventory = new Inventory<>();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nInventory System");
            System.out.println("1. Inventory Item Details");
            System.out.println("2. Location-Based Inventory");
            System.out.println("3. Distributor-Based Inventory");
            System.out.println("4. Exit")
        }
    }
}
