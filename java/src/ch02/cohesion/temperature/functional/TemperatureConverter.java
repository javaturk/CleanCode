package org.javaturk.cc.ch02.cohesion.temperature.functional;

public interface TemperatureConverter {
	
	public double convert(TemperatureType source, TemperatureType target, double degree);

}
