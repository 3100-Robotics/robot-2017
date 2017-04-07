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


    private static Spark ballFeeder = new Spark(RobotMap.ballFeederChanel);
    private static Spark tankCycle = new Spark(RobotMap.tankCycleMotor);

    private Encoder rotSpeed = new Encoder(0, 1);



    public void initDefaultCommand() {

    }


    public void mix() {
        //wait.dosomething.afterwait
        ballFeeder.set(1);
        tankCycle.set(1);
    }

    public void stopMixing() {
        ballFeeder.set(0);
        tankCycle.set(0);
    }

}