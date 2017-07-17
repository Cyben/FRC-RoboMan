package org.usfirst.frc.team4320.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	
	//Controllers Ports
	public static final int XBOX_CONTROLLER = 0;
	
	//PWMS
	//PWM port for Arm_Motor
	public static final int ARM_TALON = 0;
	
	//Analogs
	//Analog port for ARM_Potentiometer
	public static final int ARM_POTENT = 0;
	
	//DIOS
	public static final int ARM_MIN_SWITCH = 0;
	public static final int ARM_MAX_SWITCH = 1;
	
	//constant speed
	public static final double CONSTANT_SPEED = 0.4;
	
	//constant angles
	public static final double MAX_ANGLE = 90;
	public static final double MIN_ANGLE = 0;
	
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
