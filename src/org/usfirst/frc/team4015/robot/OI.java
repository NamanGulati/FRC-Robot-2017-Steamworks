package org.usfirst.frc.team4015.robot;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team4015.robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;

/* =============================================================================
 * This class stores the objects that are used to interface with the joysticks
 * and controllers used for controlling the robot.
 * ============================================================================*/
public class OI
{	
	public static Joystick leftStick = new Joystick(RobotMap.leftStickPort);
	public static Joystick rightStick = new Joystick(RobotMap.rightStickPort);
	public static DigitalInput limitSwitch= new DigitalInput(1);
}
