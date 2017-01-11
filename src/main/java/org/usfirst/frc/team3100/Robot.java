package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.subsystems.*;
import org.usfirst.frc.team3100.commands.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;


public class Robot extends IterativeRobot {
    public static MainDrive drive;
    public static OI oi;
    public static Shooter shooter;

    public void robotInit() {
        drive = new MainDrive();
        oi = new OI();
        shooter = new Shooter();
        SmartDashboard.putData("Main Drive", drive);

    }

    public void autonomousInit() {

    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();

    }

    public void testPeriodic() {

    }
}
