package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;
import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;

public class ArmMoveByParameters extends Command {

	public ArmMoveByParameters(){
		
		requires(Robot.armsSubsystem);
	}
	
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		
		Robot.armsSubsystem.MoveArms(Robot.oi.getController().getY(Hand.kLeft));
		
		
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		if(((Robot.armsSubsystem.getPotentAngle() <= RobotMap.MIN_ANGLE) || (Robot.armsSubsystem.getMinSwitchState())) && (Robot.armsSubsystem.getArmTalonSpeed()<0))
			return true;
		else if(((Robot.armsSubsystem.getPotentAngle() >= RobotMap.MAX_ANGLE) || (Robot.armsSubsystem.getMaxSwitchState())) && (Robot.armsSubsystem.getArmTalonSpeed()>0))
			return true;
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.armsSubsystem.MoveArms(0);
	}
		
	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}
