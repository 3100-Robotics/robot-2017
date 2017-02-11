package org.usfirst.frc.team3100.subsystems;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.commands.Drive;

public class MainDrive extends Subsystem {

    private Spark leftMotor = RobotMap.leftMotor;
    private Spark rightMotor = RobotMap.rightMotor;
    private RobotDrive mainDrive = new RobotDrive(leftMotor, rightMotor);

    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }

    public void drive(double move, double rotate, double modifier) {
        double modifierFix = 1 - modifier;
        mainDrive.arcadeDrive(move * modifierFix, rotate * modifierFix);
    }
}
