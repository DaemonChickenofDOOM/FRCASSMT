package team3647robotPackage;

import edu.wpi.first.wpilibj.Encoder;

public class Encoders 
{		
	public Encoder leftEncoder = new Encoder(0,1, false, Encoder.EncodingType.k4X);
	public Encoder rightEncoder = new Encoder(4,5, false, Encoder.EncodingType.k4X);
	
	public double getRightEncoder()
	{
		return rightEncoder.get();
	}
  
	//This function returns the value of the left encoder
	public double getLeftEncoder()
	{
		return leftEncoder.get();
	}
}
