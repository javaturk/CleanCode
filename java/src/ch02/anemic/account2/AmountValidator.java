package org.javaturk.cc.ch02.anemic.account2;

import org.javaturk.cc.ch02.coupling.account.ex.NegativeAmountException;

public class AmountValidator {
	
	public void validate(double amount) throws NegativeAmountException {
		if(amount < 0)
		      throw new NegativeAmountException(amount);

	}
}
