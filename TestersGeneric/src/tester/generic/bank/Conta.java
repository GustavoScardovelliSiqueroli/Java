package tester.generic.bank;

import java.util.List;

public interface Conta {
	

	public String consultar();
	
	public boolean sacar(float quantia);
	
	public boolean depositar(float quantia);
	
	public <T> boolean transferir(float quantia, T t);
	
	public void teste(List<? extends Conta> x);
	
	public <T extends Conta> void teste2(List<T>ListObjetctT);
}
