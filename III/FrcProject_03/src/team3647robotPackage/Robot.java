package team3647robotPackage;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot 
{	/***************************************
	 * TODO: Refactor to
	 * org.usfirst.team3647.robot
	 **************************************/
	//This function is run whenever the robot starts. This function is used for any initialization of code
	@Override
	Joysticks JSO;
        Encoders EO;
        Motors MO;
    public void robotInit() {
	    JSO = new Joysticks();
	    EO = new Encoders();
	    MO = new Motors();
	}

	 //This function runs once, right before autonomous period starts. 
	@Override
	public void autonomousInit() {

	}

	//This is the function that is called during the autonomous period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void autonomousPeriodic() {

	}

	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void teleopPeriodic() {
	    
		JSO.updateMainController(); // get joystick values
		/* prevent reset encoder if in dead zone */
		if(Joysticks.leftJoySticky = 0) EO.reset();
		/* set motor power */
		Motors.left.set(Joysticks.leftJoySticky);
		Motors.right.set(-Joysticks.leftJoySticky);
		/***************************************
		 * This code determines the direction of
		 * travel, and uses the correct course
		 * correction software to perform course 
		 * corrections if needed. 
		 **************************************/
		if(Joysticks.leftJoySticky < 0){
		    backwards(EO.getLeftEnc(), EO.getRightEnc());
		}
		else if(Joysticks.leftJoysticky > 0){
		    forwards(EO.getLeftEnc(), EO.getRightEnc(), );
		}
		else{//this *really* shouldn't be happening. Panic.
		    Motors.left.set(0);
		    Motors.right.set(0);
		}

		
	}
    private void forwards(double left, double right){
	double lspeed, rspeed;
	leftspeed = rightspeed = Joysticks.leftJoySticky;
	/***************************************
	 * code for forwards PID
	 * Encoder objects are supposed to be
	 * positive.
	 *
	 * Slow down the "faster" motor, which
	 * should have a higher encoder value,
	 * and speed up the "slower" encoder
	 * value.
	 * Note: motor power for right motor is 
	 * always negative, so you still need to
	 * add to it to slow it down and vice 
	 * versa.
	 **************************************/
	
	if(left < 0 || right < 0){
	    MO.stop();
	}
	else if(left < right){
	    lspeed+=adjustment;
	    rspeed-=adjustment;
	    /* update the motor powah */
	    Motors.left.set(lspeed);
	    Motors.right.set(-rspeed);
	}
	else if (right < left){
	    lspeed-=adjustment;
	    rspeed+=adjustment;
	    /* update the motor powah */
	    Motor.left.set(lspeed);
	    Motors.right.set(-rspeed);
	}
	    
    }
    private void backwards(double left, double right){
	// code for backwards PID
	MO.stop();
    }

	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	@Override
	public void testPeriodic() 
	{
		
	}
}

