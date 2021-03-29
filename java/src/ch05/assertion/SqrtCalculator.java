package org.javaturk.cc.ch05.assertion;

public class SqrtCalculator {

	public static void main(String[] args) {
		SqrtCalculator sq = new SqrtCalculator();

		System.out.println(sq.sqrt3(625));
		System.out.println(sq.sqrt3(12));
		System.out.println(sq.sqrt3(17));
	}

	public double sqrt1(int x) {
		return Math.sqrt(x);
	}
	
	public double sqrt2(int x) {
		if (x < 0)
			throw new IllegalArgumentException("Negative number!" + x); //
		else
			return Math.sqrt(x);
	}

	public double sqrt3(int x) {
		assert x >= 0 : "Negative number: " + x;
//		Debug.assert(x >= 0, "Negative number: " + x);
		return Math.sqrt(x);
	}
}
