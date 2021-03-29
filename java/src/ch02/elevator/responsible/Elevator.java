package org.javaturk.cc.ch02.elevator.responsible;

public interface Elevator {
	
	public void go(Floor desiredFloor);
	
	public void openDoor();
	
	public void closeDoor();

}
