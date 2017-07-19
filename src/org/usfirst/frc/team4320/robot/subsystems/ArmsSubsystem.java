package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ArmsSubsystem extends Subsystem{
	//Talon speed controller 
	private Talon armTalon;
	private AnalogPotentiometer armPotent;
	private DigitalInput armMaxMicroSwitch;
	private DigitalInput armMinMicroSwitch;
	
	//inspect instance
	private static ArmsSubsystem instance;
	
	public static ArmsSubsystem getInstance(){
		if(instance == null)
			instance = new ArmsSubsystem();
		return instance;
	}
	
	//constructor
	private ArmsSubsystem(){
		
		armTalon = new Talon(RobotMap.ARM_TALON);
		armPotent = new AnalogPotentiometer(RobotMap.ARM_POTENT);
		armMaxMicroSwitch = new DigitalInput(RobotMap.ARM_MAX_SWITCH);
		armMinMicroSwitch = new DigitalInput(RobotMap.ARM_MIN_SWITCH);
				
	}
	
	public void MoveArms(double speed){
		armTalon.set(speed);
	}
	//get motor speed
	public double getArmTalonSpeed(){
		return armTalon.get();
	}
	//return ptentiometer angel
	public double getPotentAngle(){
		return armPotent.get() * 72;
	}
	//retern MicroSwitchs state
	public boolean getMinSwitchState(){
		return armMinMicroSwitch.get();
	}
	
	public boolean getMaxSwitchState(){
		return armMaxMicroSwitch.get();
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}	
}
