package org.javaturk.cc.ch02.elevator;

import org.javaturk.cc.ch02.elevator.domain.PrimitiveElevator;

public class PrimitiveElevatorTest {

	public static void main(String args[]) {

		PrimitiveElevator primitiveElevator = new PrimitiveElevator();

		primitiveElevator.openDoor();
		primitiveElevator.closeDoor();
		primitiveElevator.goDown();
		primitiveElevator.goUp();
		primitiveElevator.goUp();
		primitiveElevator.openDoor();
		primitiveElevator.closeDoor();
		primitiveElevator.goDown();
		primitiveElevator.openDoor();
		primitiveElevator.goDown();
		primitiveElevator.closeDoor();
		primitiveElevator.goDown();
		primitiveElevator.goDown();

		int curFloor = primitiveElevator.getFloor();

		if (curFloor != 5 && !primitiveElevator.getDoorStatus()) {
			primitiveElevator.go(5);
		}

		primitiveElevator.go(-1_000_000);
		primitiveElevator.openDoor();
	}
}
