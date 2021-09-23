package com.example.cinma.data;

import android.provider.BaseColumns;

public class CritiquesContrat {

    public static final class CritiqueFilm implements BaseColumns{
        public static final String TABLE_NAME = "Critiques";
        public static final String COLUMN_TITRE_FILM = "titre_film";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_HEURE = "heure";
        public static final String COLUMN_NOTE_SCENARIO = "note_scenario";
        public static final String COLUMN_NOTE_REALISATION = "note_realisation";
        public static final String COLUMN_NOTE_MUSIQUE = "note_musique";
        public static final String COLUMN_DESCRIPTION = "desciption";
    }
}
