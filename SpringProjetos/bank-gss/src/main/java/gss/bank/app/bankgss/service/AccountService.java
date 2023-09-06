package gss.bank.app.bankgss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import gss.bank.app.bankgss.model.Account;
import gss.bank.app.bankgss.model.AccountInterface;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountService implements AccountInterface {

	private Account accountteste;
	
	
	@Override
	public boolean whithdraw() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deposit(long amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E> List<E> check() {
		// TODO Auto-generated method stub
		return null;
	}
//
//	@Override
//	public boolean register(String id, String CPF, String name) {
//		accountteste.ge
//		return false;
//	}

	@Override
	public boolean register(String id, String CPF, String name) {
		
		return accountteste.isTeste();
	}

}
