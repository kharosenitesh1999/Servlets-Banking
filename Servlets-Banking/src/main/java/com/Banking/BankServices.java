package com.Banking;

public class BankServices {

	BankDao dao =new BankDao();
	public void openAccount(Bank bank) {
		
		dao.openAccountDao(bank);
		
	}
public void signUp(Bank bank) {
		
		dao.signUpDao(bank);
		
	}

public void signIn(Bank bank) {
		
		dao.signInDao(bank);
		
	}

public void forget(Bank bank) {
		
		dao.forgetdao(bank);
		
	}
}
