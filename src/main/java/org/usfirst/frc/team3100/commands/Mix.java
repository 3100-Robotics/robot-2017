package org.usfirst.frc.team3100.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3100.Robot;

public class Mix extends Command {
    public Mix() {
        super("Mixer");
        requires(Robot.mixer);

    }
    public void initialize() {
        if(Robot.oi.mixState == true) {
            Robot.mixer.mix();
            Robot.oi.mixState = false;

        } else {
            Robot.mixer.stopMixing();
            Robot.oi.mixState = true;
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

