package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.interfaces.Gyro;

import static edu.wpi.first.wpilibj.Relay.Direction.kForward;

public class RobotMap {
    public static int controller = 1;
    private static int leftDriveChannel = 1;
    private static int rightDriveChannel = 2;
    private static int shootChannel = 4;
    //private static int turretRotChannel = ;
    //private static int turretYChannel = ;
    private static int ballMotorChannel = 5;
    private static int climbMotorChannel = 3;
    public static int ballFeederChanel = 6;

    //For some reason these can't be defined as final.
    public static XBoxController  controls = new XBoxController(controller);
    public static Spark leftMotor = new Spark(leftDriveChannel);
    public static Spark rightMotor = new Spark(rightDriveChannel);
    public static Spark shootMotor = new Spark(shootChannel);
    //public static Spark turretRot = new Spark(turretRotChannel);
    //public static Spark turretY = new Spark(turretYChannel);
    public static Spark ballMotor = new Spark(ballMotorChannel);
    public static Spark climbMotor = new Spark(climbMotorChannel);
    public static Encoder shootCheck = new Encoder(0,1);
    public static Gyro gyro = new ADXRS450_Gyro();
    public static Spark ballFeeder = new Spark(ballFeederChanel);



    }
