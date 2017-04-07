package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team3100.subsystems.*;
import org.usfirst.frc.team3100.commands.*;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.Relay;


public class Robot extends IterativeRobot {
    Command autonomousCommand;
    SendableChooser autoChooser;
    public static MainDrive drive;
    public static OI oi;
    public static Shooter shooter;
    public static BallGrabber pickup;
    public static ClimbUp climb;
    public static Relay light;
    public static Mixer mixer;
    CameraServer server;
    //private static ZMultiCamera camera;
    public NetworkTable table;
    private static NetworkTable networkTable;
    private boolean works = true;
    public static boolean autoVal;
    //Stuff.work.java(plz, true);
    //else(thanks obama);



    public void robotInit() {


        table = NetworkTable.getTable("Test table");
        networkTable = NetworkTable.getTable("3t");
        //camera = new ZMultiCamera("cam0","cam5");

        drive = new MainDrive();
        shooter = new Shooter();
        pickup = new BallGrabber();
        climb = new ClimbUp();
        light = new Relay(0);
        mixer = new Mixer();

        autoChooser = new SendableChooser();
        autoChooser.addObject("Shooting", new Shoot());
        autoChooser.addObject("Drive Straight", new Drive());
        SmartDashboard.putData("Autonomous Mode Chooser", autoChooser);

        //subsystems have to be defined BEFORE oi, or it doesn't load onto the rio correctly
        oi = new OI();
        SmartDashboard.putData("Main Drive", drive);
        SmartDashboard.putData("Shooter ", shooter);
        SmartDashboard.putData("Pickup", pickup);
        SmartDashboard.putData("Light", light);
        SmartDashboard.putData("Climb", climb);
        SmartDashboard.putData("Mixer", mixer);

        server = CameraServer.getInstance();
        server.startAutomaticCapture();
        server.getVideo();


    }

    public void autonomousInit() {
        autoVal = true;
        autonomousCommand = (Command) autoChooser.getSelected();
        autonomousCommand.start();

    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();

    }

    public void teleopPeriodic() {
        autoVal = false;
        Scheduler.getInstance().run();
        //light.set(Relay.Value.kOn);

    }

    public void testPeriodic() {

    }
}
