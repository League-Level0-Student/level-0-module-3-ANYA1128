import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();

	public static void main(String[] args) {

		String color = JOptionPane.showInputDialog("What color do you want your shape in?");
		if (color.equalsIgnoreCase("blue")) {
			rob.penDown();
			rob.setPenColor(0, 0, 200);
		} else if (color.equalsIgnoreCase("red")) {
			rob.penDown();
			rob.setPenColor(200, 0, 0);
		} else if (color.equalsIgnoreCase("green")) {
			rob.penDown();
			rob.setPenColor(0, 200, 0);
		} else if (color.equalsIgnoreCase("teal")) {
			rob.penDown();
			rob.setPenColor(0, 170, 200);
		} else if (color.equalsIgnoreCase("purple")) {
			rob.penDown();
			rob.setPenColor(100, 0, 105);
		} else {
			JOptionPane.showMessageDialog(null, "This color is not available");
		}

		String shape = JOptionPane.showInputDialog("Which shape do you want to draw? A triangle, square, or circle?");
		if (shape.equalsIgnoreCase("square")) {
			drawsquare();
		} else if (shape.equalsIgnoreCase("triangle")) {
			drawtriangle();
		} else {
			drawcircle();
		}
	}

	static void drawsquare() {
		rob.setSpeed(50);
		rob.penDown();
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
	}

	static void drawtriangle() {
		rob.setSpeed(50);
		rob.penDown();
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
	}

	static void drawcircle() {
		rob.setSpeed(50);
		rob.penDown();
		for (int i = 0; i < 72; i++) {
			rob.turn(5);
			rob.move(5);
		}
	}
}
