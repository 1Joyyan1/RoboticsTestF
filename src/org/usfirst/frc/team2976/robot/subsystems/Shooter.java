package org.usfirst.frc.team2976.robot.subsystems;

import org.usfirst.frc.team2976.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	private Victor BallL = new Victor(RobotMap.shooter_left);
	private Victor BallR = new Victor(RobotMap.shooter_right);
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void Shoot(){
		BallL.set(1);
		BallR.set(-1);
	}
	public void intake(){
		BallL.set(-0.5);
		BallR.set(0.5);
	}
	public void Stop(){
		BallL.set(0);
		BallR.set(0);
	}
}
