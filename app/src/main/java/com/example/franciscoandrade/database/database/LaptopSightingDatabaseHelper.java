package com.example.franciscoandrade.database.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by franciscoandrade on 1/14/18.
 */

public class LaptopSightingDatabaseHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "laptop_sighting.db";
    private static final String TABLE_NAME = "laptop_sighting";
    private static final int SCHEMA_VERSION = 1;


    public LaptopSightingDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, SCHEMA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME +
                " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "last_name TEXT, " +
                "first_name TEXT, " +
                "open Boolean, " +
                "age INTEGER, " +
                "open Boolean, " +
                "course TEXT, " +
                "date_created DATETIME DEFAULT CURRENT_TIMESTAMP);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
