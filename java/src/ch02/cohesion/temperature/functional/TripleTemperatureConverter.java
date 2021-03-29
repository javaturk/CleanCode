package org.javaturk.cc.ch02.cohesion.temperature.functional;

import org.javaturk.cc.ch02.cohesion.temperature.functional.command.ConvertCommand;

public class TripleTemperatureConverter implements TemperatureConverter {
	
	private ConvertCommand c2FConvert;
	
	private ConvertCommand f2CConvert;
	
	private ConvertCommand c2KConvert;
	
	private ConvertCommand k2CConvert;
	
	private ConvertCommand k2FConvert;
	
	private ConvertCommand f2KConvert;

	@Override
	public double convert(TemperatureType source, TemperatureType target, double degree) {
		
		double result = 0.0;

		if (source == TemperatureType.CELSIUS) {
			if (target == TemperatureType.FAHRENHEIT)
				result = c2FConvert.execute(degree);
			else if (target == TemperatureType.KELVIN)
				result = c2KConvert.execute(degree);
			else if (target == TemperatureType.CELSIUS)
				result = degree;
		} else if (source == TemperatureType.FAHRENHEIT) {
			if (target == TemperatureType.CELSIUS)
				result = f2CConvert.execute(degree);
			else if (target == TemperatureType.KELVIN)
				result = f2KConvert.execute(degree);
			else if (target == TemperatureType.FAHRENHEIT)
				result = degree;
		} else if (source == TemperatureType.KELVIN) {
			if (target == TemperatureType.FAHRENHEIT)
				result = k2FConvert.execute(degree);
			else if (target == TemperatureType.CELSIUS)
				result = k2CConvert.execute(degree);
			else if (target == TemperatureType.KELVIN)
				result = degree;
		}
		
		return result;
	}
}
