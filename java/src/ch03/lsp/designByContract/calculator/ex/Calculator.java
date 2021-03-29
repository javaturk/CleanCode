package org.javaturk.cc.ch03.lsp.designByContract.calculator.ex;

public class Calculator {

	public int add(int i, int j) throws NegativeArgumentException{
		return i + j;
	}
}
