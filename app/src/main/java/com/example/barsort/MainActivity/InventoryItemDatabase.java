package com.example.barsort.MainActivity;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database (entities = {InventoryItem.class}, version=1)
public abstract class InventoryItemDatabase extends RoomDatabase {
    private static final String DATABASE_NAME="InventoryItem.db";
    private static InventoryItemDatabase IntventoryItemDatabase;

    public static InventoryItemDatabase getInstance(Context context) {
        if (InventoryItemDatabase == null) {
            InventoryItemDatabase = Room.databaseBuilder(context, InventoryItemDatabase.class,
                    DATABASE_NAME.AlowMainThreadQueries().build());
        }

        return InventoryItemDatabase;
    }
    public abstract InventoryItemDatabase

}
