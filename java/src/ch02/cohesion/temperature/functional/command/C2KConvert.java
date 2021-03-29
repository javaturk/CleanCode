package org.javaturk.cc.ch02.cohesion.temperature.functional.command;

public class C2KConvert implements ConvertCommand{

	@Override
	public double execute(double degree) {
		double result = degree + 273.15;
		return result;
	}
}