package org.usfirst.frc.team2976.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2976.robot.commands.ExampleCommand;
import org.usfirst.frc.team2976.robot.commands.Intake;
import org.usfirst.frc.team2976.robot.commands.Shoopt;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
   Joystick Driver=new Joystick(0);
   Joystick Driver2 = new Joystick(1);
   Joystick Operator=new Joystick(2);
	public OI(){
		JoystickButton Shoot = new JoystickButton(Operator,2);
		JoystickButton Intaake = new JoystickButton(Operator, 1);
		Shoot.whileHeld(new Shoopt());
		Intaake.whileHeld(new Intake());
	}
	public Joystick getDriverJoystick(){
		return Driver;
	}
	public Joystick getDriver2Joystick(){
		return Driver;
	}
	public Joystick getOpJoystick(){
		return Operator;
	}
}

