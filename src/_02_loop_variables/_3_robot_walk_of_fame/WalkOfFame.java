
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot robot = new Robot("mini");
		// setup the robot
		robot.setX(50);
		robot.setY(300);
		robot.setSpeed(30);
		robot.setAngle(90);
		
		
	// in total, these nested loops run 25 times
	for(int j = 0; j < 5; j++) {
		for(int i = 0; i < 5; i++) {
			robot.penDown();
			robot.move(100);
			robot.turn(144);
		}
		robot.penUp();
		robot.move(150);
		
	}
}
}
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */


