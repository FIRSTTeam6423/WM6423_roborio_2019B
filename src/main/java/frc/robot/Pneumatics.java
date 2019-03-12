/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
*/ 


//import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.interfaces.Potentiometer;

//import com.ctre.phoenix.motorcontrol.FeedbackDevice;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
//import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.*;
//import edu.wpi.first.wpilibj.GenericHID.Hand;
//import edu.wpi.first.wpilibj.SPI.Port;
//import frc.robot.Robot;
//import frc.robot.RobotMap;
import frc.robot.HardwareMap;

public class Pneumatics 
{

  /****
   * This class is the subsystem that controls the pneumatics and the robot's driving
   * when the extra wheels have been dropped down. 
   * 
   * The two pneumatic wheels will be used when the robot has elevated itself as it climbs up
   * the ramp. 
   * 
   * The robot should be able to come and down with the pneumatics because the front and back 
   * pneumatic systems are independent of each other. 
   * ***/
  // Dummy numbers until solution is discovered. 
  //TODO: Resolve hardware mapping for solenoids and other pneumatic components. 
  /*
    Spark pneumaticWheelRight = new Spark(RobotMap.climbWheelRight); //Spark(20); 
    Spark pneumaticWheelLeft = new Spark(RobotMap.climbWheelLeft);//Spark(21);
    
    SpeedControllerGroup pnuematicGroup = new SpeedControllerGroup(pneumaticWheelLeft, pneumaticWheelRight);
    DifferentialDrive pneumaticDrive = new DifferentialDrive(pneumaticWheelLeft, pneumaticWheelRight); 
    //Need differential drive object so motors can be  controlled with Xbox. 

    Solenoid pneumaticClimbUp = new Solenoid(RobotMap.pnuematic_climb_up); //Back system
    Solenoid pneumaticClimbDown = new Solenoid(RobotMap.pnuematic_climb_down); //Front system
    */ 

    public Pneumatics()
    {
        
    }
    public void setWheelState(boolean state) 
    /***Method for Solenoid state. Setting it on turn them on while
     * setting it false cuts off power to them to make the air 
    go up the tubes and retract the wheels. 
    */
    /*
    {
        pneumaticClimbUp.set(state);
        pneumaticClimbDown.set(state);
    }

    public boolean isBackSolenoidOn() //Checks to see if the back solenoid is on. 
    {
      if(pneumaticClimbDown.get() == true)
      {
        System.out.println("The climb down Solenoid is on.");
        return true; 
      } 
      else
      {
        return false; 
      }
    }

    public boolean isFrontSolenoidOn() //Checks to see if the front solenoid is on. 
    {
      if(pneumaticClimbUp.get() == true)
      {
        System.out.println("The climb up Solenoid is on.");
        return true; 
      }
      else
      {
        return false; 
      }
  
    }
    @Override
    protected void initDefaultCommand() {

    }

	public void setMotorValue(double value) {//Motor value passed in a command class. 
       pnuematicGroup.set(value);
    }

  public void stopMotors() //Turn off back motors that the back wheels that move when robot is on. 
  {
    pnuematicGroup.set(0); 
  }
  public void setSolenoidPulseTime(double time) 
  /*Sets the amount of seconds of the pulse is controlled by the PCM and triggers the PCM to make 
  a pulse of the duration passsed in the 'time' parameter of this method. 
  */
  /*
  {
      pneumaticClimbDown.setPulseDuration(time);
      pneumaticClimbUp.setPulseDuration(time);

      pneumaticClimbDown.startPulse();
      pneumaticClimbUp.startPulse();
  }

  public void driveWithXboxJoysticks(double leftSpeed, double rightSpeed) 
  /**Method for controlling pneumatic wheels with xbox. Call in a command class with OI.*/
  {
   // pneumaticDrive.tankDrive(leftSpeed, rightSpeed);
  } 
  /*TODO: Need to write method to make sure the pneumatic drive motors do not burn out when 
  they recieve too much current. 
  */
    
}