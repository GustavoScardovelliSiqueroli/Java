package com.example.agendatorbd.controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.agendatorbd.BD.DBHelper;
import com.example.agendatorbd.models.Contato;

import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

    private SQLiteDatabase db;
    private DBHelper helper;

    public ContatoDao(Context context) {
        helper = new DBHelper(context);
    }

    public void Abrir(){
        db = helper.getReadableDatabase();
    }

    public void Fechar(){
        helper.close();
    }

    public Long Inserir(Contato contato){
        ContentValues dados = new ContentValues();

        dados.put("Nome", contato.getNome());
        dados.put("Celular", contato.getCelular());
        dados.put("Email", contato.getEmail());

        Long sqlId = db.insert(DBHelper.tblAgenda, null, dados);
        return sqlId;
    }

    public List<Contato> ListarContatos(){

        List<Contato> lista = new ArrayList<Contato>();

        String campos[] = new String[]{"Nome","Celular","Email"};
        Cursor cursor = db.query(DBHelper.tblAgenda, campos, null, null,
                null, null, "Nome");

        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Contato contato = new Contato(cursor.getString(0),
                    cursor.getString(1), cursor.getString(2));
            lista.add(contato);
            cursor.moveToNext();
        }

        cursor.close();
        return lista;
    }

}
