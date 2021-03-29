package org.javaturk.cc.ch02.cohesion.temperature.functional.command;

public class F2KConvert implements ConvertCommand{

	@Override
	public double execute(double degree) {
		double result = (degree - 32) * 5 / 9 + 273.15;
		return result;
	}
}
