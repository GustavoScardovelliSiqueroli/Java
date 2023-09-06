package gss.bank.app.bankgss.model;

import java.util.List;

public interface AccountInterface {

	public boolean register(String id, String CPF, String name);
	public boolean whithdraw();
	public boolean deposit(long amount);
	public<E> List<E> check();
	
	
}
