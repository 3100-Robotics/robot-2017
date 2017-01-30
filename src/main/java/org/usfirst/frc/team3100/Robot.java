package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.subsystems.*;
import org.usfirst.frc.team3100.commands.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.Relay;


public class Robot extends IterativeRobot {
    public static MainDrive drive;
    public static OI oi;
    public static Shooter shooter;
    public static BallGrabber pickup;
    public static Relay light;


    public void robotInit() {
        drive = new MainDrive();
        shooter = new Shooter();
        pickup = new BallGrabber();
        light = new Relay(0);
        //subsystems have to be defined BEFORE oi, or it doesn't load onto the rio correctly
        oi = new OI();
        SmartDashboard.putData("Main Drive", drive);
        SmartDashboard.putData("Shooter ", shooter);
        SmartDashboard.putData("Pickup", pickup);
        SmartDashboard.putData("Light", light);

    }

    public void autonomousInit() {

    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        //light.set(Relay.Value.kOn);

    }

    public void testPeriodic() {

    }
}
