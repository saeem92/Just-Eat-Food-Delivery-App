package com.example.yummyfood_justtasteit.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RestaurantEntity::class], version = 1)
abstract class RestaurantDatabase : RoomDatabase() {

    abstract fun restaurantDao() :
        com.example.yummyfood_justtasteit.database.RestaurantDao

}