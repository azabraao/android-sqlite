package com.example.sqliteandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contato contato = new Contato("Abraao","az.abraao@gmail.com","55958079381");

        MeuDB meuDB = new MeuDB(this);
        meuDB.Inserir(contato);
    }


}