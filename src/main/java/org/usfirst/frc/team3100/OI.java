package org.usfirst.frc.team3100;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team3100.commands.Shoot;


public class OI {
    private XBoxController controller = RobotMap.controls;
    private Button shootButton = new JoystickButton(controller, XBoxController.leftBumper);

    public double getDriveMoveSpeed() {
        return controller.getLeftStickY();
    }
    public double getRotateSpeed() {
        return controller.getRightStickX();
    }
    public OI() {
        shootButton.whenPressed(new Shoot());
    };



}
