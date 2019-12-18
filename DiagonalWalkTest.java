package tests;

import robo.AbstractRobot;
import robo.MoveableDiagonalInterface;

public class DiagonalWalkTest {
	public static int SimpleDiagonalWalkTest(AbstractRobot robot) {
		
		int percentage = 0;
		
		if(((MoveableDiagonalInterface) robot).moveUpRight()) {
			System.err.println("Move test failed\nREASON: moveUpRight() out of bounds!");
			return percentage;
		}
		percentage += 25;
		
		robot.setY(100);
		if(((MoveableDiagonalInterface) robot).moveUpLeft()) {
			System.err.println("Move test failed\nREASON: moveUpLeft() out of bounds!");
			return percentage;
		}
		percentage += 25;
		
		robot.setX(25);
		robot.setY(100);
		if(((MoveableDiagonalInterface) robot).moveDownRight()) {
			System.err.println("Move test failed\nREASON: moveDownRight() out of bounds!");
			return percentage;
		}
		percentage += 25;
		
		robot.setX(0);
		robot.setY(50);
		if(((MoveableDiagonalInterface) robot).moveDownLeft()) {
			System.err.println("Move test failed\nREASON: moveDownLeft() out of bounds!");
			return percentage;
		}
		percentage += 25;
		
		return percentage;
	}

}