package org.javaturk.cc.ch02.cohesion.temperature.procedural.v2;

public class TemperatureConverter {

	public double convert(char source, char target, double degree) {

		double result = 0.0;

		if (source == 'c') {
			if (target == 'f')
				result = convertC2F(degree);
			else if (target == 'k')
				result = convertC2K(degree);
			else if (target == 'c')
				result = degree;
		} else if (source == 'f') {
			if (target == 'c')
				result = convertF2C(degree);
			else if (target == 'k')
				result = convertF2K(degree);
			else if (target == 'f')
				result = degree;
		} else if (source == 'k') {
			if (target == 'f')
				result = convertK2F(degree);
			else if (target == 'c')
				result = convertK2C(degree);
			else if (target == 'k')
				result = degree;
		}

		return result;
	}

	private double convertC2F(double degree) {
		double result = (degree * 9 / 5) + 32;
		return result;
	}

	private double convertC2K(double degree) {
		double result = degree + 273.15;
		return result;
	}

	private double convertF2C(double degree) {
		double result = (degree - 32) * 5 / 9;
		return result;
	}

	private double convertF2K(double degree) {
		double result = (degree - 32) * 5 / 9 + 273.15;
		return result;
	}

	private double convertK2C(double degree) {
		double result = degree - 273.15;
		return result;
	}

	private double convertK2F(double degree) {
		double result = (degree - 273.15) * 9 / 5 + 32;
		return result;
	}
}
