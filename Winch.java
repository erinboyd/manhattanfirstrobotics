package org.usfirst.frc.team6400.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Winch extends Subsystem {
    
	public final Winch winch = new RobotDrive(0); //whatever you already had here
     // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	LiveWindow.addActuator("Winch", "Winch",winch);
    }
    
    public void startWinch() {
    	motor.set(1);
    }
    
    public void stopWinch() {
    	motor.set(-1);
    }
}
