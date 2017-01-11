package org.usfirst.frc.team3100.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;


public class Pickup extends Command {

    public Pickup() {
        super("Pickup");
        requires(Robot.pickup);
    }

    public void initialize() {
        if(Robot.oi.ballGrabState == true) {
            Robot.pickup.start();
            Robot.oi.ballGrabState = false;
        } else {
            Robot.pickup.stop();
            Robot.oi.ballGrabState = true;
        }


    }

    public void execute() {

    }

    public boolean isFinished() {
        return true;
    }

    public void end () {
    }

    public void interrupted() {

    }
}
