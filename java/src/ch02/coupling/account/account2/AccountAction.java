package org.javaturk.cc.ch02.coupling.account.account2;

import org.javaturk.cc.ch02.coupling.account.ex.InsufficentBalanceException;

public interface AccountAction {
	
	public double act(double balance, double amount) throws InsufficentBalanceException;

}
