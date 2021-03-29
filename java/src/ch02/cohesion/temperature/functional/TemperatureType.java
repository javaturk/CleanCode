package org.javaturk.cc.ch02.cohesion.temperature.functional;

public enum TemperatureType {
	
	CELSIUS("Celsius"), FAHRENHEIT("Fahrenheit"), KELVIN("Kelvin");
	
	private String name;
	
	private TemperatureType(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static TemperatureType getTemperatureType(String typeString) {
		TemperatureType type;
		if(typeString.equals(CELSIUS.getName()))
			type = CELSIUS;
		else if(typeString.equals(FAHRENHEIT.getName()))
			type = FAHRENHEIT;
		else
			type = KELVIN;
		
		return type;
	}
}