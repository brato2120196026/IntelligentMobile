package com.example.patientinformationapp;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "patient_database";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_USER = "users";
    private static final String TABLE_USER_ADDRESS = "users_address";
    private static final String TABLE_USER_AGE = "users_age";
    private static final String TABLE_USER_SEX = "users_sex";
    private static final String TABLE_USER_CONTACT = "users_contact";
    private static final String TABLE_USER_CITY = "users_city";


    private static final String KEY_ID = "id";
    private static final String KEY_FIRSTNAME = "name";
    private static final String KEY_ADDRESS = "address";
    private static final String KEY_AGE = "age";
    private static final String KEY_SEX = "sex";
    private static final String KEY_CONTACT = "contact";
    private static final String KEY_CITY = "city";

    /*CREATE TABLE students ( id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, phone_number TEXT......);*/

    private static final String CREATE_TABLE_STUDENTS = "CREATE TABLE "
            + TABLE_USER + "(" + KEY_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_FIRSTNAME + " TEXT );";

    private static final String CREATE_TABLE_USER_ADDRESS = "CREATE TABLE "
            + TABLE_USER_ADDRESS + "(" + KEY_ID + " INTEGER,"+ KEY_ADDRESS + " TEXT );";

    private static final String CREATE_TABLE_USER_AGE = "CREATE TABLE "
            + TABLE_USER_AGE + "(" + KEY_ID + " INTEGER,"+ KEY_AGE + " TEXT );";


    private static final String CREATE_TABLE_USER_SEX = "CREATE TABLE "
            + TABLE_USER_SEX + "(" + KEY_ID + " INTEGER,"+ KEY_SEX + " TEXT );";


    private static final String CREATE_TABLE_USER_CONTACT = "CREATE TABLE "
            + TABLE_USER_CONTACT + "(" + KEY_ID + " INTEGER,"+ KEY_CONTACT + " TEXT );";


    private static final String CREATE_TABLE_USER_CITY = "CREATE TABLE "
            + TABLE_USER_CITY + "(" + KEY_ID + " INTEGER,"+ KEY_CITY + " TEXT );";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        Log.d("table", CREATE_TABLE_STUDENTS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_STUDENTS);
        db.execSQL(CREATE_TABLE_USER_ADDRESS);
        db.execSQL(CREATE_TABLE_USER_AGE);
        db.execSQL(CREATE_TABLE_USER_SEX);
        db.execSQL(CREATE_TABLE_USER_CONTACT);
        db.execSQL(CREATE_TABLE_USER_CITY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS '" + TABLE_USER + "'");
        db.execSQL("DROP TABLE IF EXISTS '" + TABLE_USER_ADDRESS + "'");
        db.execSQL("DROP TABLE IF EXISTS '" + TABLE_USER_AGE + "'");
        db.execSQL("DROP TABLE IF EXISTS '" + TABLE_USER_SEX + "'");
        db.execSQL("DROP TABLE IF EXISTS '" + TABLE_USER_CONTACT + "'");
        db.execSQL("DROP TABLE IF EXISTS '" + TABLE_USER_CITY + "'");
        onCreate(db);
    }

    public void addUser(String name, String address, String age, String sex, String contact, String city) {
        SQLiteDatabase db = this.getWritableDatabase();
        //adding user name in users table
        ContentValues values = new ContentValues();
        values.put(KEY_FIRSTNAME, name);

        // db.insert(TABLE_USER, null, values);
        long id = db.insertWithOnConflict(TABLE_USER, null, values, SQLiteDatabase.CONFLICT_IGNORE);

        //adding user hobby in users_hobby table
        ContentValues valuesAddress = new ContentValues();
        valuesAddress.put(KEY_ID, id);
        values.put(KEY_ADDRESS, address);
        db.insert(TABLE_USER_ADDRESS, null, valuesAddress);

        //adding user age in users_age table
        ContentValues valuesAge = new ContentValues();
        valuesAge.put(KEY_ID, id);
        valuesAge.put(KEY_AGE, age);
        db.insert(TABLE_USER_AGE, null, valuesAge);

        //adding user sex in users_sex table
        ContentValues valuesSex = new ContentValues();
        valuesSex.put(KEY_ID, id);
        valuesSex.put(KEY_SEX, sex);
        db.insert(TABLE_USER_SEX, null, valuesSex);

        //adding user contact in users_contact table
        ContentValues valuesContact = new ContentValues();
        valuesContact.put(KEY_ID, id);
        valuesContact.put(KEY_CONTACT, contact);
        db.insert(TABLE_USER_CONTACT, null, valuesContact);

        //adding user city in users_city table
        ContentValues valuesCity = new ContentValues();
        valuesCity.put(KEY_ID, id);
        valuesCity.put(KEY_CITY, city);
        db.insert(TABLE_USER_CITY, null, valuesCity);
    }
//TO ADD USER MODEL <>
    public ArrayList<UserModel> getAllUsers() {
        ArrayList<UserModel> userModelArrayList = new ArrayList<>();

        String selectQuery = "SELECT  * FROM " + TABLE_USER;
        SQLiteDatabase db = this.getReadableDatabase();
        @SuppressLint("Recycle") Cursor c = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                UserModel userModel = new UserModel();
                userModel.setId(c.getInt(c.getColumnIndex(KEY_ID)));
                userModel.setName(c.getString(c.getColumnIndex(KEY_FIRSTNAME)));


                //getting user address where id = id from user_address table
                String selectAddressQuery = "SELECT  * FROM " + TABLE_USER_ADDRESS +" WHERE "+KEY_ID+" = "+ userModel.getId();
                Log.d("oppp",selectAddressQuery);
                //SQLiteDatabase db address = this.getReadableDatabase();
                @SuppressLint("Recycle") Cursor cAddress = db.rawQuery(selectAddressQuery, null);

                if (cAddress.moveToFirst()) {
                    do {
                        userModel.setAddress(cAddress.getString(cAddress.getColumnIndex(KEY_ADDRESS)));
                    } while (cAddress.moveToNext());
                }


                //getting user age where id = id from user_age table
                String selectAgeQuery = "SELECT  * FROM " + TABLE_USER_AGE+" WHERE "+KEY_ID+" = "+ userModel.getId();
                //SQLiteDatabase dbAddress = this.getReadableDatabase();
                @SuppressLint("Recycle") Cursor cAge = db.rawQuery(selectAgeQuery, null);

                if (cAge.moveToFirst()) {
                    do {
                        userModel.setAge(cAge.getString(cAge.getColumnIndex(KEY_AGE)));
                    } while (cAge.moveToNext());
                }


                //getting user sex where id = id from user_sex table
                String selectSexQuery = "SELECT  * FROM " + TABLE_USER_SEX+" WHERE "+KEY_ID+" = "+ userModel.getId();
                //SQLiteDatabase dbSex = this.getReadableDatabase();
                @SuppressLint("Recycle") Cursor cSex = db.rawQuery(selectSexQuery, null);

                if (cSex.moveToFirst()) {
                    do {
                        userModel.setSex(cSex.getString(cSex.getColumnIndex(KEY_SEX)));
                    } while (cSex.moveToNext());
                }


                //getting user contact where id = id from user_contact table
                String selectContactQuery = "SELECT  * FROM " + TABLE_USER_CONTACT+" WHERE "+KEY_ID+" = "+ userModel.getId();
                //SQLiteDatabase dbContact = this.getReadableDatabase();
                @SuppressLint("Recycle") Cursor cContact = db.rawQuery(selectContactQuery, null);

                if (cContact.moveToFirst()) {
                    do {
                        userModel.setContact(cContact.getString(cContact.getColumnIndex(KEY_CONTACT)));
                    } while (cContact.moveToNext());
                }


                //getting user city where id = id from user_city table
                String selectCityQuery = "SELECT  * FROM " + TABLE_USER_CITY+" WHERE "+KEY_ID+" = "+ userModel.getId();
                //SQLiteDatabase dbCity = this.getReadableDatabase();
                @SuppressLint("Recycle") Cursor cCity = db.rawQuery(selectCityQuery, null);

                if (cCity.moveToFirst()) {
                    do {
                        userModel.setCity(cCity.getString(cCity.getColumnIndex(KEY_CITY)));
                    } while (cCity.moveToNext());
                }

                // adding to Students list
                userModelArrayList.add(userModel);
            } while (c.moveToNext());
        }
        return userModelArrayList;
    }

    public void updateUser(int id, String name, String address, String age, String sex, String contact, String city) {
        SQLiteDatabase db = this.getWritableDatabase();

        // updating name in users table
        ContentValues values = new ContentValues();
        values.put(KEY_FIRSTNAME, name);
        db.update(TABLE_USER, values, KEY_ID + " = ?", new String[]{String.valueOf(id)});

        // updating address in users_address table
        ContentValues valuesAddress = new ContentValues();
        valuesAddress.put(KEY_ADDRESS, address);
        db.update(TABLE_USER_ADDRESS, valuesAddress, KEY_ID + " = ?", new String[]{String.valueOf(id)});

        // updating age in users_age table
        ContentValues valuesAge = new ContentValues();
        valuesAge.put(KEY_AGE, age);
        db.update(TABLE_USER_AGE, valuesAge, KEY_ID + " = ?", new String[]{String.valueOf(id)});

        // updating sex in users_sex table
        ContentValues valuesSex = new ContentValues();
        valuesSex.put(KEY_SEX, sex);
        db.update(TABLE_USER_SEX, valuesSex, KEY_ID + " = ?", new String[]{String.valueOf(id)});

        // updating contact in users_contact table
        ContentValues valuesContact = new ContentValues();
        valuesContact.put(KEY_CONTACT, contact);
        db.update(TABLE_USER_CONTACT, valuesContact, KEY_ID + " = ?", new String[]{String.valueOf(id)});

        // updating city in users_city table
        ContentValues valuesCity = new ContentValues();
        valuesCity.put(KEY_CITY, city);
        db.update(TABLE_USER_CITY, valuesCity, KEY_ID + " = ?", new String[]{String.valueOf(id)});
    }

    public void deleteUSer(int id) {

        // delete row in students table based on id
        SQLiteDatabase db = this.getWritableDatabase();

        //deleting from users table
        db.delete(TABLE_USER, KEY_ID + " = ?",new String[]{String.valueOf(id)});

        //deleting from users_address table
        db.delete(TABLE_USER_ADDRESS, KEY_ID + " = ?", new String[]{String.valueOf(id)});

        //deleting from users_age table
        db.delete(TABLE_USER_AGE, KEY_ID + " = ?", new String[]{String.valueOf(id)});

        //deleting from users_sex table
        db.delete(TABLE_USER_SEX, KEY_ID + " = ?", new String[]{String.valueOf(id)});

        //deleting from users_contact table
        db.delete(TABLE_USER_CONTACT, KEY_ID + " = ?", new String[]{String.valueOf(id)});

        //deleting from users_city table
        db.delete(TABLE_USER_CITY, KEY_ID + " = ?",new String[]{String.valueOf(id)});
    }
}
