package org.javaturk.cc.ch02.cohesion.temperature.functional.validator;

import org.javaturk.cc.ch02.cohesion.temperature.functional.Temperature;
import org.javaturk.cc.ch02.cohesion.temperature.functional.ex.InvalidTemperatureException;

public interface Validator {
	
	public void validate(Temperature temperature) throws InvalidTemperatureException;

}
