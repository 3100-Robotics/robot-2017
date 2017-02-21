package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team3100.XBoxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team3100.commands.*;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import java.awt.*;

import static org.usfirst.frc.team3100.RobotMap.controller;
import static org.usfirst.frc.team3100.RobotMap.controls;


public class OI {
    private XBoxController controller = RobotMap.controls;
    private Button shootButton = new JoystickButton(controller, XBoxController.leftBumper);
    private Button pickupButton = new JoystickButton(controller, XBoxController.rightBumper);
    private Button climbButton = new JoystickButton(controller, XBoxController.aButton);
    public boolean ballGrabState = true;
    public boolean climbState = true;
    public boolean shootState = true;


    public double getDriveMoveSpeed() {
        return controller.getLeftStickY();
    }
    public double getRotateSpeed() {
        return controller.getRightStickX();
    }
    public double getModifier() {
        return controller.getRightTrigger();
    }
    public OI() {
        shootButton.whenPressed(new Shoot());
        pickupButton.whenPressed(new Pickup());
        climbButton.whenPressed(new Climb());



    }





}
