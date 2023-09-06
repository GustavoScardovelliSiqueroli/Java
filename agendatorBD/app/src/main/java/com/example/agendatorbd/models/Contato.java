package com.example.agendatorbd.models;

public class Contato {
    int ContatoID;
    String Nome;
    String Celular;
    String Email;

    public Contato(String nome, String celular, String email) {

        Nome = nome;
        Celular = celular;
        Email = email;
    }

    public int getContatoID() {
        return ContatoID;
    }

    public void setContatoID(int contatoID) {
        ContatoID = contatoID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
