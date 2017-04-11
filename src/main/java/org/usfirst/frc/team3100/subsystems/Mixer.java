package org.usfirst.frc.team3100.subsystems;
import edu.wpi.first.wpilibj.Relay.Direction;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.commands.Shoot;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

import static edu.wpi.first.wpilibj.Relay.Value.kForward;
import static edu.wpi.first.wpilibj.Relay.Value.kOff;
import static edu.wpi.first.wpilibj.Relay.Value.kOn;


public class Mixer extends Subsystem {


    //private static Spark ballFeeder = null;
//    private static Spark tankCycle = null;

    private static Spark ballFeeder = RobotMap.ballFeeder;
    private static Spark tankCycle = RobotMap.tankCycle;


    public void initDefaultCommand() {

    }


    public void mix() {
        ballFeeder.set(1);
        tankCycle.set(1);
    }

    public void stopMixing() {
        ballFeeder.set(0);
        tankCycle.set(0);
    }

}