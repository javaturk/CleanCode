package org.javaturk.cc.ch03.srp.customerService.solution.ex;

public class WrongCustomerCredentialsException extends Exception {
	public WrongCustomerCredentialsException(String message){
		super(message);
	}
}
