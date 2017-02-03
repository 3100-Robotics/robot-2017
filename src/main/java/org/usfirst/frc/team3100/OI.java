package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team3100.commands.*;
import edu.wpi.first.wpilibj.interfaces.Gyro;


public class OI {
    private XBoxController controller = RobotMap.controls;
    private Button shootButton = new JoystickButton(controller, XBoxController.rightTrigger);
    private Button pickupButton = new JoystickButton(controller, XBoxController.rightBumper);
    private Button climbButton = new JoystickButton(controller, XBoxController.leftTrigger);
    public boolean ballGrabState = true;
    public boolean climbState = true;


    public double getDriveMoveSpeed() {
        return controller.getLeftStickY();
    }
    public double getRotateSpeed() {
        return controller.getRightStickX();
    }
    public OI() {
        shootButton.whenPressed(new Shoot());
        pickupButton.whenPressed(new Pickup());
        climbButton.whenPressed(new Climb());


    }





}
