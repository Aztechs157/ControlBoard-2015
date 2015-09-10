package org.usfirst.frc.team157.robot.commands;

import org.usfirst.frc.team157.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GyroOutput extends Command
{

    public GyroOutput()
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize()
    {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute()
    {
        System.out.println(RobotMap.gyro.getAngle() + " " + RobotMap.gyro.getRate());
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished()
    {
        return true;
    }

    // Called once after isFinished returns true
    @Override
    protected void end()
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted()
    {
    }
}
