package devdojo.estudos.carros;

public class Carro {

	private String nome;
	private String ano;
	private String cor;

	public Carro(String nome, String ano, String cor) {
		setAno(ano);
		setNome(nome);
		setCor(cor);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", ano=" + ano + ", cor=" + cor + "]";
	}

}
