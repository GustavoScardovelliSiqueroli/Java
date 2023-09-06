package com.livrosgss.application;

import java.util.List;

import com.livrosgss.dao.LivrosDAO;
import com.livrosgss.model.Livro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printLivros();

	}

	public static void registerLivro() {

		LivrosDAO daoobj = new LivrosDAO();

		Livro livro = new Livro();
		livro.setTitulo("Maria eduar é muito gostosa");
		livro.setAutor("gustavoimaria");
		daoobj.saveLivro(livro);
	}

	public static void printLivros() {
		LivrosDAO daoobj = new LivrosDAO();

		for (Livro l : daoobj.getLivro()) {
			System.out.println("ID: " + l.getId());
			System.out.println("Ttulo: " + l.getTitulo());
			System.out.println("Autor: " + l.getAutor());
			System.out.println();
		}

	}

}
