package arraysdinamicos;

public class User {

	private static int IDCont;
	private int ID;
	private String nome;
	private String sobrenome;
	private static boolean usavel = true;
	
	public User(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;

		this.ID = IDCont;
		IDCont ++;	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public int getID() {
		return ID;
	}
	
	public static boolean testeUsavel() {
		return usavel;
	}
	
	public static int getQuantidadeUsers() {
		return IDCont;
	}
}
