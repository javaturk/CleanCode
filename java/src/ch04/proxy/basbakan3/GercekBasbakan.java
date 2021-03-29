package org.javaturk.cc.ch04.proxy.basbakan3;

public class GercekBasbakan implements Basbakan {

	@Override
	public void dertDinle(String dert) {
		System.out.println("Basbakan: Dinliyorum.");
	}

	@Override
	public void isBul(String yakinim) {
		System.out.println("Basbakan: Bana boyle isteklerle gelmeyin.");
	}
}
