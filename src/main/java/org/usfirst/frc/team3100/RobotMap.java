package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.interfaces.Gyro;

import static edu.wpi.first.wpilibj.Relay.Direction.kForward;

public class RobotMap {
    public static int controller = 1;
    public static int leftDriveChannel = 1;
    public static int rightDriveChannel = 2;
    public static int shootChannel = 4;
    public static int ballMotorChannel = 5;
    public static int climbMotorChannel = 3;
    public static int ballFeederChanel = 6;
    public static int tankCycleMotor = 7;

    //For some reason these can't be defined as final.
    //public static XBoxController controls = new XBoxController(controller);
    public static Spark leftMotor = new Spark(leftDriveChannel);
    public static Spark rightMotor = new Spark(rightDriveChannel);
    public static Spark shootMotor = new Spark(shootChannel);
    //public static Spark turretRot = new Spark(turretRotChannel);
    //public static Spark turretY = new Spark(turretYChannel);
    public static Spark ballMotor = new Spark(ballMotorChannel);
    public static Spark climbMotor = new Spark(climbMotorChannel);
    public static Spark ballFeeder = new Spark(ballFeederChanel);
    public static Spark tankCycle = new Spark(tankCycleMotor);

    //public static Gyro gyro = new ADXRS450_Gyro();



    }
