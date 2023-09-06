package com.example.agendatorbd.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_Name = "Contatinhos";
    private static final int DB_Version = 1;
    public static final String tblAgenda = "Contatos";

    public DBHelper(Context context){
        super(context, DB_Name, null, DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ tblAgenda+
                "(ContatoID integer primary key autoincrement,"+
                " Nome text not null,"+
                " Celular text not null, Email text not null)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists "+ tblAgenda);
        onCreate(db);
    }

}
