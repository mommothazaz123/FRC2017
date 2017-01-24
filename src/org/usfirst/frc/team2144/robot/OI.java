package org.usfirst.frc.team2144.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick left = new Joystick(0);
	private Joystick right = new Joystick(1);

	public double getStickX() {
		return left.getX();
	}

	/**
	 * returns non-inverted Y
	 */
	public double getStickY() {
		return left.getY();
	}

	public double getStickRot() {
		return left.getTwist();
	}

	public double getStick2X() {
		return right.getX();
	}

	public double getStick2Y() {
		return right.getY();
	}

	public double getStick2Rot() {
		return right.getTwist();
	}

	public boolean getStick2Mecanum() {
		return right.getRawButton(2);
	}

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
