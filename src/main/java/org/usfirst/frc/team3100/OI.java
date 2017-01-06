package org.usfirst.frc.team3100;

public class OI {
    private XBoxController controller = RobotMap.controls;

    public double getDriveMoveSpeed() {
        return controller.getLeftStickY();
    }
    public double getRotateSpeed() {
        return controller.getRightStickX();
    }




}
