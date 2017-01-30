package org.usfirst.frc.team3100.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3100.RobotMap;


public class BallGrabber extends Subsystem {

    private Spark grabMotor = RobotMap.ballMotor;

    public void initDefaultCommand() {

    }

    public void start() {
        grabMotor.set(-1);
    }

    public void stop() {
        grabMotor.set(0);
    }
}