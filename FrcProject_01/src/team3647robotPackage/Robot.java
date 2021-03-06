package team3647robotPackage;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot 
{
	/* This program is designed to have the robot switch between
	 * moving forward or backwards at the touch of a button.
	 */
	
	int direction = 1; //determine if the robot is moving forwards or backwards
	int gradient = 0.4; //Determine what we want max power to be
	
	Joysticks JSO;
	
	//This function is run whenever the robot starts. This function is used for any initialization of code
	@Override
	public void robotInit() 
	{
		JSO = new Joysticks();
	}

	 //This function runs once, right before autonomous period starts. 
	@Override
	public void autonomousInit() 
	{

	}

	//This is the function that is called during the autonomous period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void autonomousPeriodic() 
	{
		
	}

	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void teleopPeriodic() 
	{
		JSO.updateMainController();
		if(Joysticks.buttonA){
			direction = direction * -1;
		}
		switch(direction) {
		case 1: motorPower(1);
		break;
		case -1: motorPower(-1);
		break;
		default: motorPower(0);
		}
	}
	
	public void motorPower(int power){
		power = power * gradient;
		motorObject.leftMotor.set(power);
		motorObject.rightMotor.set(-power);
	}
	
	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	@Override
	public void testPeriodic() 
	{
		
	}
}

