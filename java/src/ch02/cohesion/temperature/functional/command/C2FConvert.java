package org.javaturk.cc.ch02.cohesion.temperature.functional.command;

public class C2FConvert implements ConvertCommand{

	@Override
	public double execute(double degree) {
		double result = (degree * 9 / 5) + 32;
		return result;
	}
}