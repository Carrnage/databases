package com.quintincarr.databases;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase db;
    private Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list_view);
        SQLiteOpenHelper databaseHelper = new MyDatabaseHelper(this);
        try{
            SQLiteDatabase db = databaseHelper.getReadableDatabase();
            //code to read from database
            Cursor cursor = db.query("COUNTRY", new String[] {"_id", "NAME","DESCRIPTION"},
                    null, null, null, null, null);
            SimpleCursorAdapter cursorAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, cursor, new String[] {"NAME"}, new int[] {android.R.id.text1}, 0);
            listView.setAdapter(cursorAdapter);
        }
        catch (SQLiteException ex){
            Toast.makeText(this,"SQL Error",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        cursor.close();
        db.close();
    }
}