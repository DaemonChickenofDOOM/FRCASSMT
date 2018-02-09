package team3647robotPackage;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot 
{	
	//The speed of the robot while running the program
	double speed = 0.3;
	double leftspeed = speed;
	double rightspeed = speed;
	double distance = 500;
	double adjustment = 0.02;
	Encoders encObj;
	//This function is run whenever the robot starts. This function is used for any initialization of code
	@Override
	public void robotInit() 
	{
		encObj = new Encoders();
	}

	 //This function runs once, right before autonomous period starts. 
	@Override
	public void autonomousInit() 
	{
		encObj.reset();

		/* Motorgeschwindigkeit auslösen */
		Motors.left.set(speed);
		Motors.right.set(-speed);
	}

	//This is the function that is called during the autonomous period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void autonomousPeriodic() 
	{
		
		if(encObj.getLeftEnc() < encObj.getRightEnc()) {
			leftspeed+=adjustment;
			rightspeed-=adjustment;
			Motors.left.set(leftspeed);
			Motors.right.set(-rightspeed);
		}
		
		else if (encObj.getLeftEnc() > encObj.getRightEnc()){
			leftspeed-=adjustment;
			rightspeed+=adjustment;
			Motors.left.set(leftspeed);
			Motors.right.set(-rightspeed);
		}
	}

	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void teleopPeriodic() 
	{

	}

	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	@Override
	public void testPeriodic() 
	{
		
	}
}

