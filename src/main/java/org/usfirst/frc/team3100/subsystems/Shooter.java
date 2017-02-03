package org.usfirst.frc.team3100.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.commands.Shoot;
import edu.wpi.first.wpilibj.command.PIDSubsystem;


public class Shooter extends PIDSubsystem {

    private Spark shooterMotor = RobotMap.shootMotor;
    private Encoder rotSpeed = RobotMap.shootCheck;
    private PIDController pidControl;

    public Shooter() {
        super("Shooter", 2.0, 1.0, 1.0);
        setAbsoluteTolerance(0);
    }

    public void initDefaultCommand() {

    }

    protected double returnPIDInput() {
        return rotSpeed.getRate();
    }

    protected void usePIDOutput(double output) {
        shooterMotor.pidWrite(output);
    }


    public void shoot() {
        setSetpoint(-0.45);
    }

    public void stopShooting() {
        setSetpoint(0);
    }
}