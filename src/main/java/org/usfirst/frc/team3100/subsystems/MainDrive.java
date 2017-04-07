package org.usfirst.frc.team3100.subsystems;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.RobotMap;
import org.usfirst.frc.team3100.commands.Drive;
import java.lang.Math;

/**
 * Created by nicco on 2/14/17.
 */
public class MainDrive extends PIDSubsystem {

    private SpeedController leftMotor = new Spark(RobotMap.leftDriveChannel);
    private SpeedController rightMotor = new Spark(RobotMap.rightDriveChannel);
    private RobotDrive mainDrive;
    private Gyro gyro = new ADXRS450_Gyro();
    private double targetMove = 0;
    private double targetRotate = 0;
    private boolean DEBUG = true;
    public static final double ROTATE_COEFF = 2;
    public static final double JOYSTIC_EPSILON = 0.17;

    private static double setting = 0.0;

    private double setHeading(double move, double rotate){



        if((Math.abs(move) < JOYSTIC_EPSILON) && (Math.abs(rotate) < JOYSTIC_EPSILON)){
            setting = gyro.getAngle();
        } else if (Math.abs(rotate) >= JOYSTIC_EPSILON) {
            setting = (setting + (rotate * ROTATE_COEFF));
            if (rotate > 0){
                //setting = 10;
            } //else setting = -10;
        }
        return setting;

    }


    public MainDrive(){


        super("MainDrive", 0.04,0,0.012);
        mainDrive = new RobotDrive(leftMotor, rightMotor);
        setOutputRange(-1,1);
        getPIDController().setContinuous();
        enable();
        SmartDashboard.putNumber("P", getPIDController().getP());
        SmartDashboard.putNumber("I", getPIDController().getI());
        SmartDashboard.putNumber("D", getPIDController().getD());
        SmartDashboard.putNumber("SetPoint", getSetpoint());
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }

    protected double returnPIDInput() {
        SmartDashboard.putNumber("Gryo", gyro.getAngle());
        return gyro.getAngle();
    }

    protected void usePIDOutput(double output) {
        SmartDashboard.putNumber("PID Output", output);
        mainDrive.arcadeDrive((targetMove * (-1)), -output);
    }
    public void drive(double move, double rotate) {
        targetMove = move;
        setSetpoint(setHeading(move, rotate));

        enable();

        if (DEBUG) {
            getPIDController().setPID(
                    SmartDashboard.getNumber("P"),
                    SmartDashboard.getNumber("I"),
                    SmartDashboard.getNumber("D")
            );
        }
        SmartDashboard.putNumber("P", getPIDController().getP());
        SmartDashboard.putNumber("I", getPIDController().getI());
        SmartDashboard.putNumber("D", getPIDController().getD());

        SmartDashboard.putNumber("SetPoint", getSetpoint());

        SmartDashboard.putNumber("Move", move);
        SmartDashboard.putNumber("Rotate", rotate);

        SmartDashboard.putNumber("Left Drive", leftMotor.get());
        SmartDashboard.putNumber("Right Drive", rightMotor.get());
    }

}