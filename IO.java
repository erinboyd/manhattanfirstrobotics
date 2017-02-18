package org.usfirst.frc.team6400.robot;


import org.usfirst.frc.team6400.robot.commands.BallPickupForward;
import org.usfirst.frc.team6400.robot.commands.BallPickupReverse;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

import org.usfirst.frc.team6400.robot.commands.OpenGear;
import org.usfirst.frc.team6400.robot.commands.CloseGear;
import org.usfirst.frc.team6400.robot.commands.WinchOn;
import org.usfirst.frc.team6400.robot.commands.WinchOff;
//import org.usfirst.frc.team6400.robot.commands.LowerIntake;
//import org.usfirst.frc.team6400.robot.commands.PosCatForLaunch;
//import org.usfirst.frc.team6400.robot.commands.PosCatForLoad;
//import org.usfirst.frc.team6400.robot.commands.RaiseIntake;
import org.usfirst.frc.team6400.robot.commands.SwitchDirection;

import libraries.XboxController;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public XboxController leftController = new XboxController(0);

//UPDATE LIST
//RightTrigger - opengeargobbler
//LeftTrigger - closegeargobbler
//Y - start winch
//B - stop winch
//A - do something
//X - do something
//LeftBumper - do something
//RightBumper - do something
//Start - do something
//Back - do something
    
    public OI() {
    	leftController.setDeadband(0.2);

	
    //Winch
    	Button winchStart = new JoystickButton(leftController, XboxController.Y);
    	launch.whenPressed(new OpenGear());
    	Button winchStart = new JoystickButton(leftController, XboxController.B);
    	launch.whenPressed(new CloseGear());
    // 	LaunchGroup.whenPressed(new LaunchGroup());



    //Gear
//    	Button gearOpen = new JoystickButton(leftController, XboxController.RightTrigger);
//   	Button gearClose = new JoystickButton(leftController, XboxController.LeftTrigger);
//    	launch.whenPressed(new Launch());
//    	lockLatch.whenPressed(new LockLatch());
//    	LaunchGroup.whenPressed(new LaunchGroup());

		
//	//Driving
//		Button switchDirection = new JoystickButton(driveController, XboxController.Start);
//		switchDirection.whenPressed(new SwitchDirection());
    }
}
