package org.usfirst.frc.team3100.commands;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.subsystems.ClimbUp;

/**
 * Created by Aiden on 2/3/17.
 */

public class Climb extends Command {
    public Climb() {
        super("Climb");
        requires(Robot.climb);
    }

    public void initialize() {
            if (Robot.oi.climbState == true) {
            Robot.climb.start();
            Robot.oi.climbState = false;
        } else {
            Robot.climb.stop();
            Robot.oi.climbState = true;
        }


    }

    public void execute() {

    }

    public boolean isFinished() {
        return true;
    }

    public void end() {
    }

    public void interrupted() {

    }
}
