package org.javaturk.cc.ch02.cohesion.temperature.functional.ex;

public class InvalidTemperatureException extends Exception {
	private static String message = "Invalid value passed: ";
	
	public InvalidTemperatureException(String message){
		super(message);
	}

}
