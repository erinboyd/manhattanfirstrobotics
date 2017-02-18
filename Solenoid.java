package org.usfirst.frc.team6400.robot.subsystems;

import org.usfirst.frc.team6400.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class LaunchLatch extends Subsystem {
    
	public final Solenoid latch = new Solenoid(0); //this should correspond to a port on the robioRIO PWM
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	LiveWindow.addActuator("Pistons", "Latch", latch);
    }
    
    public void open() {
    	latch.set(true);
    }
    
    public void close() {
    	latch.set(false);
    }
}
