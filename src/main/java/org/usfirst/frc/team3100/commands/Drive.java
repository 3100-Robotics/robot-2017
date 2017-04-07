package org.usfirst.frc.team3100.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.XBoxController;
import org.usfirst.frc.team3100.subsystems.MainDrive;
import org.usfirst.frc.team3100.subsystems.Shooter;

import static org.usfirst.frc.team3100.Robot.autoVal;
import static org.usfirst.frc.team3100.Robot.shooter;

public class Drive extends Command              {

    public Drive(){
        super("Drive");
        requires(Robot.drive);
    }
    private static MainDrive drive = Robot.drive;
    private static XBoxController controller = new XBoxController(RobotMap.controller);

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        if(autoVal == false) {
            drive.drive(controller.getLeftStickY(), controller.getRightStickX());
        } else {
            drive.drive(-.75,0);
            Timer.delay(8);
            drive.drive(0,0);
        }
    }


    protected boolean isFinished() {
        return false;
    }


    protected void interrupted(){
        drive.drive(0, 0);
    }

    @Override
    protected void end() {

    }
}
