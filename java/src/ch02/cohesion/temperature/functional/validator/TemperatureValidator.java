package org.javaturk.cc.ch02.cohesion.temperature.functional.validator;

import org.javaturk.cc.ch02.cohesion.temperature.functional.Temperature;
import org.javaturk.cc.ch02.cohesion.temperature.functional.TemperatureType;
import org.javaturk.cc.ch02.cohesion.temperature.functional.ex.InvalidTemperatureException;

public class TemperatureValidator implements Validator{

	@Override
	public void validate(Temperature temperature) throws InvalidTemperatureException {
		double degree = temperature.getDegree();
		TemperatureType type = temperature.getType();
		
		if(type.equals(TemperatureType.CELSIUS) & degree < -273)
			throw new InvalidTemperatureException("Celcius can't be lower than -273. Degree provided: " + degree);
		
		if(type.equals(TemperatureType.KELVIN) & degree < 0)
			throw new InvalidTemperatureException("Kelvin can't be lower than 0. Degree provided: " + degree);
		
		if(type.equals(TemperatureType.FAHRENHEIT) & degree < -459.67)
			throw new InvalidTemperatureException("Fahrenheit can't be lower than -459.67. Degree provided: " + degree);
	}
}
