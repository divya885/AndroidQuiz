package com.example.divya.androidquiz;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

    // Database name : AccountsManager.db
    public DatabaseHandler(Context context) {
        super(context, "AccountsManager.db", null, 1);
    }

    // Creating Tables
    // Table name : Accounts
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table Accounts(Username text primary key,Email_id text,Password text)");
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS Accounts");

        // Create tables again
        onCreate(db);
    }

    // Inserting in database
    public boolean insert(String name,String email,String psswd)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Username",name);
        contentValues.put("Email_id",email);
        contentValues.put("Password",psswd);
        long ins = db.insert("Accounts",null,contentValues);

        return ins != -1;

    }

    // Checking if Username exists;
    public Boolean chkname(String name)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        @SuppressLint("Recycle") Cursor cursor = db.rawQuery("Select * from Accounts where Username=?",new String[]{name});

        //return false if user name does not exists
        return cursor.getCount() > 0;   //return true if user name exists
    }

    // Checking if Password matches or not;
    public Boolean chkpsswd(String psswd)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        @SuppressLint("Recycle") Cursor cursor = db.rawQuery("Select * from Accounts where Password=?",new String[]{psswd});

        //return false if password does not matches
        return cursor.getCount() > 0;    //return true if password matches
    }
}


