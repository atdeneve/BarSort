package com.example.barsort.MainActivity;

import androidx.annotation.NonNull;

public class InventoryItem {
    private String itemName;
    private String itemImage;
    private String itemDescription;
    private String itemLocation;
    private String itemDistributor;
    private int itemCurrentCount;
    private int itemPar;
    private boolean mustOrder;

    public InventoryItem(
            String itemName,
            String itemImage,
            String itemDescription,
            String itemLocation,
            String itemDistributor,
            int itemCurrentCount,
            int itemPar) {
         this.itemName = itemName;
         this.itemImage = itemImage;
         this.itemDescription = itemDescription;
         this.itemLocation = itemLocation;
         this.itemDistributor = itemDistributor;
         this.itemCurrentCount = itemCurrentCount;
         this.itemPar = itemPar;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getItemImage() { return itemImage; }
    public void setItemImage(String itemImage) {this.itemImage = itemImage; }

    public String getItemDescription() { return itemDescription; }
    public void setItemDescription(String itemDescription) {this.itemDescription = itemDescription; }

    public String getItemLocation() { return itemLocation; }
    public void setItemLocation(String itemLocation) { this.itemLocation = itemLocation; }

    public String getItemDistributor() { return itemDistributor; }
    public void setItemDistributor(String itemDistributor) {this.itemDistributor = itemDistributor; }
    public int getItemCurrentCount() { return itemCurrentCount; }
    public void setItemCurrentCount(int itemCurrentCount) { this.itemCurrentCount = itemCurrentCount; }
    public int getItemPar() { return itemPar; }
    public void setItemPar(int itemPar) { this.itemPar = itemPar; }
    public boolean mustOrder() { return mustOrder; }

    @NonNull
    @Override
    public String toString() {
        return "Inventory Item{\n" +
                "itemName=' " + itemName + "\n'" +
                ", itemImage=' " + itemImage + "\n'" +
                ", itemDescription=' " + itemDescription + "\n'" +
                ", itemLocation=' " + itemLocation + "\n'" +
                ", itemDistributor =' " + itemDistributor + "\n'" +
                ", itemCurrentCount =' " + itemCurrentCount + "\n'" +
                ", itemPar =' " + itemPar + "\n'"; };










}
