import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;




/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variables in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs: http://bit.ly/ninja-star */


public class FlamingNinjaStar {
	public static void main(String[] args) {


		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms


		// 1. Make a new robot, and set it's pen down.
Robot robot = new Robot(); 
robot.setPenColor(Color.black);
robot.penDown();
robot.hide();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.


		// 12. Set the robot speed to 10
robot.setSpeed(10);

		// 13. Make all the code below repeat 25 times


			// 2. Turn the robot 1/8 of a circle
for (int i = 0; i < 100000000; i++) {
	

		robot.turn(360/8);
			// 3. Move the robot 64 pixels
robot.move(64);
robot.setPenColor(Color.green);
			robot.turn(-40);
			robot.move(flameSize);
			robot.turn(170);
			robot.move(flameSize);
			robot.setPenColor(Color.black);
			robot.turn(64);
			robot.move(baseSize);
}
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			
			// 5. Move the robot the distance in the variable flameSize
			
			// 6. Turn the robot 170 degrees
			
			// 7. Move the robot the distance in the variable flameSize (again)
			
			// 8. Turn the robot 64 degrees to the right
			
			// 9. Move the robot the distance in the variable baseSize
			
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
		
	}


}








