package com.example.sqliteandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MeuDB extends SQLiteOpenHelper {

    private static final String NOME_DO_BANCO = "Meu DB";
    private static final int VERSAO = 1;

    public MeuDB(@Nullable Context context) {
        super(context,NOME_DO_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Contato (" +
                " id INTEGER NOT NULL," +
                " nome TEXT," +
                " email TEXT," +
                " telefone TEXT," +
                " PRIMARY KEY (id AUTOINCREMENT)" +
                ");";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void Inserir(Contato contato) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues cv = new ContentValues();

        cv.put("nome", contato.getNome());
        cv.put("email", contato.getEmail());
        cv.put("telefone",contato.getTelefone());

        db.insert("CV",null,cv);
    }
}
