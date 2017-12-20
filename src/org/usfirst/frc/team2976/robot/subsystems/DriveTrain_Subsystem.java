package org.usfirst.frc.team2976.robot.subsystems;

import org.usfirst.frc.team2976.robot.RobotMap;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain_Subsystem extends Subsystem{
	private RobotDrive MainDrive = new RobotDrive(RobotMap.Drive_right, RobotMap.Drive_left);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	
	public void TeleopDrive(Joystick Driver){
		MainDrive.tankDrive(Driver.getX(), Driver.getX());
	}
	public void Stop(){
		MainDrive.drive(0,0);
	}

}
