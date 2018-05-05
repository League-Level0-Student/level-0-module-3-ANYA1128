//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Robot rob = new Robot();
			String answer = JOptionPane.showInputDialog(null, "What color would you like the robot to draw with?");
			if (answer.equals("red")) {
				rob.setPenColor(110, 0, 0);
			} else if (answer.equals("green")) {
				rob.setPenColor(0, 110, 0);
			} else if (answer.equals("teal")) {
				rob.setPenColor(0, 90, 100);
			} else if (answer.equals("blue")) {
				rob.setPenColor(0, 0, 110);
			} else if (answer.equals("purple")) {
				rob.setPenColor(110, 0, 110);
			} else {
				JOptionPane.showMessageDialog(null, "This color is not available");
				rob.setRandomPenColor();
			}
				
					
				
				rob.setSpeed(10000000);
			    rob.setPenWidth(10);
				rob.penDown();
				rob.move(100);
				rob.turn(90);
				rob.move(100);
				rob.turn(90);
				rob.move(100);
				rob.turn(90);
				rob.move(100);
				rob.turn(90);

			}
		}
	}

