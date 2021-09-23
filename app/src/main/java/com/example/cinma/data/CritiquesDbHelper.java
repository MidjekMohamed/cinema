package com.example.cinma.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.cinma.data.CritiquesContrat.CritiqueFilm;

public class CritiquesDbHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "critique_db";

    private static final int DATABASE_VERSION = 1;

    public CritiquesDbHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String SQL_Create_WEATHER_TABLE =
                "CREATE TABLE" + CritiqueFilm.TABLE_NAME + " (" +
                        CritiqueFilm._ID + " INTERGER PRIMARY KEY AUTOINCREMENT, " +
                        CritiqueFilm.COLUMN_TITRE_FILM + " VARCHAR, " +
                        CritiqueFilm.COLUMN_DATE + " INTEGER, " +
                        CritiqueFilm.COLUMN_HEURE + " INTEGER, " +
                        CritiqueFilm.COLUMN_NOTE_SCENARIO + " INTEGER, " +
                        CritiqueFilm.COLUMN_NOTE_REALISATION + " INTEGER, " +
                        CritiqueFilm.COLUMN_NOTE_MUSIQUE + " INTEGER, " +
                        CritiqueFilm.COLUMN_DESCRIPTION + " VARCHAR, "+");";

        sqLiteDatabase.execSQL(SQL_Create_WEATHER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
