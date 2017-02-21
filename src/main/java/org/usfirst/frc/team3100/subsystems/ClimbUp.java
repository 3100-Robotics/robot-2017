package org.usfirst.frc.team3100.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3100.RobotMap;

/**
 * Created by Aiden on 2/3/17.
 */
public class ClimbUp extends Subsystem {
    private Spark climbMotor = RobotMap.climbMotor;

    public void initDefaultCommand() {

    }

    public void start() {
        climbMotor.set(-.5);
    }

    public void stop() {
        climbMotor.set(0);
    }
}
