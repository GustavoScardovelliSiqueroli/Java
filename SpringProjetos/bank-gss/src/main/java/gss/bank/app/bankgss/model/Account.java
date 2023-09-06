package gss.bank.app.bankgss.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class Account {
	
	private String id;
	private String CPF;
	private String name;
	private long balance;
	private boolean teste;
	

}
