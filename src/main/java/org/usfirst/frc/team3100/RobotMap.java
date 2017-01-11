package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {
    public static final int controller = 1;
    private static final int leftDriveChannel = 5;
    private static final int rightDriveChannel = 6;
    private static final int shootChannel = 1;
    private static final int turretRotChannel = 3;
    private static final int turretYChannel = 0;
    private static final int ballMotorChannel = 0;


    public static final XBoxController  controls = new XBoxController(controller);
    public static final SpeedController leftMotor = new Victor(leftDriveChannel);
    public static final SpeedController rightMotor = new Victor(rightDriveChannel);
    public static final SpeedController shootMotor = new Victor(shootChannel);
    public static final SpeedController turretRot = new Victor(turretRotChannel);
    public static final SpeedController turretY = new Victor(turretYChannel);
    public static final SpeedController ballMotor = new Victor(ballMotorChannel);




}
