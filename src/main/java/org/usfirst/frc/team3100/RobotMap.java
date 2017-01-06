package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {
    public static final int controller = 1;
    private static final int leftDriveChannel = 5;
    private static final int rightDriveChannel = 6;

    public static final XBoxController  controls = new XBoxController(controller);
    public static final SpeedController leftMotor = new Victor(leftDriveChannel);
    public static final SpeedController rightMotor = new Victor(rightDriveChannel);





}
