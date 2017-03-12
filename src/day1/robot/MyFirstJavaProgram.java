package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) throws InterruptedException {
		
		// START HERE
	
Robot rawrxd = new Robot();

for (int i = 0; i < 360; i++) {
	rawrxd.penDown();
	rawrxd.setRandomPenColor();
	rawrxd.move(5);
	rawrxd.turn(1);
	
	
}
	
		
		
	}
}
