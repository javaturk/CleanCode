package org.javaturk.cc.ch02.cohesion.temperature.procedural.v1;

public class TemperatureConverter  {

	public double convert(char source, char target, double degree) {
		
		double result = 0.0;

		if (source == 'c') {
			if (target == 'f')
				result = (degree * 9 / 5) + 32;
			else if (target == 'k')
				result = degree + 273.15;
			else if (target == 'c')
				result = degree;
		} else if (source == 'f') {
			if (target == 'k')
				result = (degree - 32) * 5 / 9;
			else if (target == 'k')
				result = (degree - 32) * 5 / 9 + 273.15;
			else if (target == 'f')
				result = degree;
		} else if (source == 'k') {
			if (target == 'f')
				result = (degree - 273.15) * 9 / 5 + 32;
			else if (target == 'c')
				result = degree - 273.15;
			else if (target == 'k')
				result = degree;
		}
		
		return result;
	}
}
