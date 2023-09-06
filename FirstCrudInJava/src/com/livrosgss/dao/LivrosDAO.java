package com.livrosgss.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.livrosgss.factory.ConnectionFactory;
import com.livrosgss.model.Livro;
import com.mysql.jdbc.PreparedStatement;

public class LivrosDAO {

	public void saveLivro(Livro livro) {

		String sql = "INSERT INTO livros(titulo, autor) VALUES(? ,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMysql();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, livro.getTitulo());
			pstm.setString(2, livro.getAutor());
			pstm.execute();
			System.out.println("Book saved with success");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Livro> getLivro() {

		String sql = "SELECT * FROM livros"; // String SQL(Query) para ser rodada no banco através do prepareStatment

		List<Livro> livros = new ArrayList<Livro>(); // Lista de livros para receber as informações do banco

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null; // obj que recebe (modela) as informações que o preparedStatment roda

		try {
			conn = ConnectionFactory.createConnectionToMysql(); // criando conexão

			pstm = (PreparedStatement) conn.prepareStatement(sql); // fazendo que, através da conexão conn, armazene um
																	// objeto de PreparedStatement com o sql dentro
			rset = pstm.executeQuery(); // objeto ResultSet recebendo o que o pstm executou

			while (rset.next()) {
				Livro livro = new Livro();
				livro.setId(rset.getInt("id"));
				livro.setTitulo(rset.getString("titulo"));
				livro.setAutor(rset.getNString("autor"));

				livros.add(livro);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rset != null) {
					rset.close();

				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return livros;

	}
}
