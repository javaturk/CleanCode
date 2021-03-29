/**
 * 
 */
package org.javaturk.cc.ch05.assertion;

public class PrePostConditionsExample {

	public static void main(String[] args) {
		Car car = new Car();
//		car.speed = 100;
		assert car.checkStopped() : "Not stopped!";; 	// Pre-condition check
		
		car.accelerate(100);
		assert !car.checkStopped() : "Not moving!";	// Post-condition check
		
		car.stop();
		assert car.checkStopped() : "Not stopped!";;  // Post-condition check
	}
}

class Car {
	boolean started;
	int speed;

	public void accelerate(int speed) {
		this.speed = speed;
		started = true;
	}

	public void stop() {
		speed = 0;
		started = false;
	}

	public boolean checkStopped() {
		if (speed > 0 | started) // Change it to "!started" to see the assertion error.
			return false;
		else
			return true;
	}
}
