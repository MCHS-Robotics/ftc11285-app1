package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by student on 11/15/16.
 */

public abstract class TeleOpMap extends LinearOpMode {

    HardwareMap hMap = null;
    private ElapsedTime runtime = new ElapsedTime();
    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        initialize();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            running();
            idle(); // Always call idle() at the bottom of your while(opModeIsActive()) loop
        }
    }

    public abstract void initialize();//Initializes robot (add servos and motors to hMap)
    public abstract void running();//Runs when OpMode starts


}