package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by student on 11/15/16.
 */

//@Autonomous(name="Some Name", group="Some Group") <-- add line in when extending this
public abstract class AutonomousMap extends LinearOpMode {
    public HardwareMap hMap = null;//Hardware Map

    public void runOpMode() throws InterruptedException {
        initialize();
        idle();

        telemetry.addData("Status", "Initializing");
        telemetry.update();

        waitForStart();

        telemetry.addData("Status", "Running");
        telemetry.update();

        running();

        telemetry.addData("Status", "Complete");
        telemetry.update();
    }

    public abstract void initialize(); //Initialize HardwareMap (add things to hMap)
    public abstract void running();//Runs this on start
    public abstract void forward(double distance);//Moves robot forward some distance
    public abstract void backward(double distance);//Moves robot backward some distance
    public abstract void turnLeft(double degrees);//Turns robot left some distance
    public abstract void turnRight(double degrees);//Turns robot right some distance

}
