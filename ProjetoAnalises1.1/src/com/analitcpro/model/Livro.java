package com.analitcpro.model;

public class Livro {
	private int id;
	private String titulo;
	private String sinopse;
	private String ano;
	private int nPagina;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getNpagina() {
		return nPagina;
	}

	public void setNpagina(int npagina) {
		this.nPagina = npagina;
	}
	
	@Override
	public String toString() {
		String ts;
		ts = String.format("id: %s\n titulo: %s\n sinopse: %s\n ano: %s\n nPagina: %s\n", getId() );
		return ts;
	}
	

}
