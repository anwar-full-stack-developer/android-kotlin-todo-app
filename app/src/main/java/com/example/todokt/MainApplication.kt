package com.example.todokt

import android.app.Application
import androidx.room.Room
import com.example.todokt.database.AppDatabase

class MainApplication : Application() {
    companion object {
//        'lateinit' allows initializing a not-null property outside of a constructor
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = AppDatabase.getInstance(applicationContext);
//        database = Room.databaseBuilder(
//            applicationContext,
//            AppDatabase::class.java,
//            AppDatabase.NAME
//        ).build()
    }
}