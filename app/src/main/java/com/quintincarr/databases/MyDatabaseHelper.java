package com.quintincarr.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ListView;

public class MyDatabaseHelper  extends SQLiteOpenHelper{

    private static final String DB_NAME = "lab12";
    private static final int DB_VERSION = 1;
    MyDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "CREATE TABLE COUNTRY (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                +
                "NAME TEXT, DESCRIPTION TEXT, IMAGE_RESOURCE_ID INTEGER)"
        );
        //prepopulates data
        ContentValues countryValues = new ContentValues();
        countryValues.put("NAME","Australia");
        countryValues.put("DESCRIPTION","Australia is a country and\n" +
                "continent located in the Southern Hemisphere, known for its\n" +
                "unique wildlife and diverse landscapes.");
        countryValues.put("IMAGE_RESOURCE_ID",R.drawable.australia);
        sqLiteDatabase.insert("COUNTRY", null, countryValues);
        ContentValues countryValues2 = new ContentValues();
        countryValues2.put("NAME", "Brazil");
        countryValues2.put("DESCRIPTION", "Brazil is the largest\n" +
                "country in South America, famous for its annual carnival in Rio\n" +
                "de Janeiro and its passion for football.\"");
        countryValues2.put("IMAGE_RESOURCE_ID", R.drawable.brazil);
        sqLiteDatabase.insert("COUNTRY", null, countryValues2);
        ContentValues countryValues3 = new ContentValues();
        countryValues2.put("NAME", "Canada");
        countryValues2.put("DESCRIPTION", "Canada is the second largest country\n" +
                "by land area, renowned for its vast\n" +
                "wilderness areas and multicultural\n" +
                "cities.");
        countryValues2.put("IMAGE_RESOURCE_ID", R.drawable.canada);
        sqLiteDatabase.insert("COUNTRY", null, countryValues2);
        ContentValues countryValues4 = new ContentValues();
        countryValues2.put("NAME", "Denmark");
        countryValues2.put("DESCRIPTION", "Denmark is a Nordic country known\n" +
                "for its minimalist design, cycling\n" +
                "culture, and being the home of the\n" +
                "famous writer Hans Christian\n" +
                "Andersen");
        countryValues2.put("IMAGE_RESOURCE_ID", R.drawable.denmark);
        sqLiteDatabase.insert("COUNTRY", null, countryValues2);
        ContentValues countryValues5 = new ContentValues();
        countryValues2.put("NAME", "Egypt");
        countryValues2.put("DESCRIPTION", "Egypt is located in North Africa and is\n" +
                "famous for its ancient civilization,\n" +
                "including the pyramids and the Nile\n" +
                "River.");
        countryValues2.put("IMAGE_RESOURCE_ID", R.drawable.egypt);
        sqLiteDatabase.insert("COUNTRY", null, countryValues2);
        ContentValues countryValues6 = new ContentValues();
        countryValues2.put("NAME", "France");
        countryValues2.put("DESCRIPTION", "France is renowned for its culture,\n" +
                "gastronomy, fashion and landmarks\n" +
                "including the Eiffel Tower and the\n" +
                "Louvre, the world's largest art\n" +
                "museum.\n");
        countryValues2.put("IMAGE_RESOURCE_ID", R.drawable.france);
        sqLiteDatabase.insert("COUNTRY", null, countryValues2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
