package org.usfirst.frc.team3100.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.commands.Shoot;
import edu.wpi.first.wpilibj.command.PIDSubsystem;


public class Shooter extends Subsystem {

    private Spark shooterMotor = RobotMap.shootMotor;
    private Encoder rotSpeed = RobotMap.shootCheck;
    private PIDController pidControl;



    public void initDefaultCommand() {

    }


    public void shoot() {
        shooterMotor.set(-0.45);
    }

    public void stopShooting() {
        shooterMotor.set(0);
    }
}