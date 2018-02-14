package team3647robotPackage;

import edu.wpi.first.wpilibj.Encoder;

public class Encoders 
{
	public Encoder leftEncoder = new Encoder(0,1, false, Encoder.EncodingType.k4X);
	public Encoder rightEncoder = new Encoder(4,5, false, Encoder.EncodingType.k4X);
	public encVal values = new encVal(0,0);
	
	double getRightEnc()
	{
		return right.get();
	}
	
	double getLeftEnc()
	{
		return left.get();
	}
	
	public void reset(){
		right.reset();
		left.reset();
	}
}
